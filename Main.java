import com.sun.nio.sctp.MessageInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<FuncionarioPadrao> listaFuncionarioPadrao = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        while (flag) {
            System.out.println(
                    "=".repeat(53) +
                            "\n            SISTEMA DE FOLHA DE PAGAMENTO\n" +
                            "=".repeat(53) +
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
                leitor.nextLine();
                continue;
            }

            String nome;
            Integer matricula;
            ArrayList<String> dadosPadrao;

            switch (opcao) {
                case 1:
                    dadosPadrao = dadosPadrao(leitor);

                    nome = dadosPadrao.get(0);
                    matricula = Integer.parseInt(dadosPadrao.get(1));

                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao(nome, matricula);

                    System.out.println("Sucesso: " + nome + " Mattricula: " + matricula);
                    leitor.nextInt();

                    listaFuncionarioPadrao.add(funcionarioPadrao);

                    break;

                case 2:
                    dadosPadrao = dadosPadrao(leitor);

                    nome = dadosPadrao.get(0);
                    matricula = Integer.parseInt(dadosPadrao.get(1));

                    System.out.print("Informe valor das vendas: ");
                    Double totalValor = leitor.nextDouble();

                    System.out.print("Informe comissão percentual: ");
                    double percentual = leitor.nextDouble();

                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(nome, matricula, totalValor, percentual);
                    
                    listaFuncionarioPadrao.add(funcionarioComissionado);

                    break;
                case 3:
                    dadosPadrao = dadosPadrao(leitor);

                    nome = dadosPadrao.get(0);
                    matricula = Integer.parseInt(dadosPadrao.get(1));

                    System.out.print("Informe qtde de peças: ");
                    Integer quantidadeProduzida = leitor.nextInt();

                    System.out.print("Informe valor da peça: ");
                    double valorPorPeca = leitor.nextDouble();

                    FuncionarioProducao funcionarioProducao = new FuncionarioProducao(nome, matricula, valorPorPeca, quantidadeProduzida);

                    listaFuncionarioPadrao.add(funcionarioProducao);

                    break;

                case 4:
                    System.out.println("=".repeat(53) +
                            "\nTotal de pessoas cadastradas: " + listaFuncionarioPadrao.size() +
                            "\n" + "=".repeat(53));

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

    public static ArrayList<String> dadosPadrao(Scanner leitor) {
        ArrayList<String> valores = new ArrayList<>();
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