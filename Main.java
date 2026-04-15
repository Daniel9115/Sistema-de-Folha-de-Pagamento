import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<FuncionarioPadrao> listaFuncionarioPadrao = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        while (flag) {
            System.out.println("=========== Sistema de Folha de Pagamento ===========" +
                    "\n1 - Cadastrar Funcionário Padrão" +
                    "\n2 - Cadastrar Funcionário Comissionado" +
                    "\n3 - Cadastrar Funcionário Produção" +
                    "\n4 - Gerar Folha de Pagamento" +
                    "\n0 - Sair" +
                    "\n===========      Selecione uma opção      ===========" +
                    "\nOpção: ");

            int opcao = 0;

            try {
                opcao = leitor.nextInt();

                if (opcao < 0) {
                    System.out.println("Digite apenas número válidos!");
                    continue;
                }

            } catch (Exception numException) {
                System.out.println("Digite apenas número válidos!");
                continue;
            }

            String nome;
            Integer matricula;

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    nome = leitor.nextLine();

                    System.out.print("Matricula: ");
                    matricula = leitor.nextInt();

                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao();

                    funcionarioPadrao.setNome(nome);
                    funcionarioPadrao.setMatricula(matricula);

                    listaFuncionarioPadrao.add(funcionarioPadrao);

                    break;

                case 2:
                    System.out.print("Nome:");
                    nome = leitor.nextLine();

                    System.out.print("Matricula:");
                    matricula = leitor.nextInt();

                    System.out.print("Informe valor das vendas: ");
                    Double totalValor = leitor.nextDouble();

                    System.out.print("Informe comissão percentual: ");
                    double percentual = leitor.nextDouble();

                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado();
                    funcionarioComissionado.setNome(nome);
                    funcionarioComissionado.setMatricula(matricula);
                    funcionarioComissionado.setPercentualComissao(percentual);
                    funcionarioComissionado.setTotalVendas(totalValor);

                    listaFuncionarioPadrao.add(funcionarioComissionado);

                    break;
                case 4:
                    System.out.println("Total de pessoas cadastradas: " + listaFuncionarioPadrao.size());
                    for (FuncionarioPadrao f : listaFuncionarioPadrao)
                        System.out.println(f.mostrarDados());
                    break;
                case 0:
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }

}