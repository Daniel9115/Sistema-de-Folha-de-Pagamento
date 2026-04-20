import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<FuncionarioPadrao> listaFuncionarioPadrao = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        listaFuncionarioPadrao.add(new FuncionarioPadrao("João Silva", 101));
        listaFuncionarioPadrao.add(new FuncionarioPadrao("Maria Souza", 102));

        listaFuncionarioPadrao.add(new FuncionarioComissionado("Carlos Oliveira", 201, 10, 5000));
        listaFuncionarioPadrao.add(new FuncionarioComissionado("Ana Pereira", 202, 5, 12000));

        listaFuncionarioPadrao.add(new FuncionarioProducao("Pedro Santos", 301, 5, 100));
        listaFuncionarioPadrao.add(new FuncionarioProducao("Lucas Ferreira", 302, 3, 200));

        while (flag) {
            System.out.println(
                    "=====================================================\n" +
                    "            SISTEMA DE FOLHA DE PAGAMENTO\n" +
                    "=====================================================" +
                    "\n1 - Cadastrar Funcionário Padrão" +
                    "\n2 - Cadastrar Funcionário Comissionado" +
                    "\n3 - Cadastrar Funcionário Produção" +
                    "\n4 - Gerar Folha de Pagamento" +
                    "\n0 - Sair" +
                    "\n===========      Selecione uma opção      ===========");
            System.out.print("Opção: ");
            int opcao = 0;

            try {
                opcao = leitor.nextInt();
                leitor.nextLine();
            } catch (Exception e) {
                System.out.println("Digite apenas números válidos!");
                continue;
            }

            String nome;
            Integer matricula;
            ArrayList<String> DadosPadrao;

            switch (opcao) {
                case 1:
                    DadosPadrao = DadosPadrao();

                    nome = DadosPadrao.get(0);
                    matricula = Integer.parseInt(DadosPadrao.get(1));

                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao(nome, matricula);
                    listaFuncionarioPadrao.add(funcionarioPadrao);

                    break;

                case 2:
                    DadosPadrao = DadosPadrao();

                    nome = DadosPadrao.get(0);
                    matricula = Integer.parseInt(DadosPadrao.get(1));

                    System.out.print("Informe valor das vendas: ");
                    Double totalValor = leitor.nextDouble();

                    System.out.print("Informe comissão percentual: ");
                    double percentual = leitor.nextDouble();

                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(nome, matricula, percentual, totalValor);
                    listaFuncionarioPadrao.add(funcionarioComissionado);

                    break;
                case 3:
                    DadosPadrao = DadosPadrao();

                    nome = DadosPadrao.get(0);
                    matricula = Integer.parseInt(DadosPadrao.get(1));

                    System.out.print("Informe qtde de peças: ");
                    Integer quantidadeProduzida = leitor.nextInt();

                    System.out.print("Informe valor da peça: ");
                    double valorPorPeca = leitor.nextDouble();

                    FuncionarioProducao funcionarioProducao = new FuncionarioProducao(nome, matricula, valorPorPeca, quantidadeProduzida);
                    listaFuncionarioPadrao.add(funcionarioProducao);

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
                    System.out.println("Digite apenas números válidos!");
                    break;
            }
        }
    }

    public static ArrayList DadosPadrao() {
        ArrayList<String> valores = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String nome;
        Integer matricula;
        System.out.println("----------- CADASTRO DE FUNCIONÁRIO -----------");
        System.out.print("Nome:");
        nome = leitor.nextLine();

        System.out.print("Matricula:");
        matricula = leitor.nextInt();

        valores.add(nome);
        valores.add(matricula.toString());

        return valores;
    }

}