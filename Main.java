import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<FuncionarioPadrao> listaFuncionarioPadrao = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        FuncionarioPadrao fp1 = new FuncionarioPadrao();
        fp1.setNome("João Silva");
        fp1.setMatricula(101);
        listaFuncionarioPadrao.add(fp1);

        FuncionarioPadrao fp2 = new FuncionarioPadrao();
        fp2.setNome("Maria Souza");
        fp2.setMatricula(102);
        listaFuncionarioPadrao.add(fp2);

        FuncionarioComissionado fc1 = new FuncionarioComissionado();
        fc1.setNome("Carlos Oliveira");
        fc1.setMatricula(201);
        fc1.setPercentualComissao(10);
        fc1.setTotalVendas(5000);
        listaFuncionarioPadrao.add(fc1);

        FuncionarioComissionado fc2 = new FuncionarioComissionado();
        fc2.setNome("Ana Pereira");
        fc2.setMatricula(202);
        fc2.setPercentualComissao(5);
        fc2.setTotalVendas(12000);
        listaFuncionarioPadrao.add(fc2);

        FuncionarioProducao fp3 = new FuncionarioProducao();
        fp3.setNome("Pedro Santos");
        fp3.setMatricula(301);
        fp3.setValorPorPeca(5);
        fp3.setQuantidadeProduzida(100);
        listaFuncionarioPadrao.add(fp3);

        FuncionarioProducao fp4 = new FuncionarioProducao();
        fp4.setNome("Lucas Ferreira");
        fp4.setMatricula(302);
        fp4.setValorPorPeca(3);
        fp4.setQuantidadeProduzida(200);
        listaFuncionarioPadrao.add(fp4);

        while (flag) {
            ConsoleUtils.limparTela();
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

            ConsoleUtils.limparTela();

            switch (opcao) {
                case 1:
                    dadosPadrao = dadosPadrao(leitor);

                    nome = dadosPadrao.get(0);
                    matricula = Integer.parseInt(dadosPadrao.get(1));

                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao();
                    funcionarioPadrao.setNome(nome);
                    funcionarioPadrao.setMatricula(matricula);

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

                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado();
                    funcionarioComissionado.setNome(nome);
                    funcionarioComissionado.setMatricula(matricula);
                    funcionarioComissionado.setTotalVendas(totalValor);
                    funcionarioComissionado.setPercentualComissao(percentual);

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

                    FuncionarioProducao funcionarioProducao = new FuncionarioProducao();
                    funcionarioProducao.setNome(nome);
                    funcionarioProducao.setMatricula(matricula);
                    funcionarioProducao.setQuantidadeProduzida(quantidadeProduzida);
                    funcionarioProducao.setValorPorPeca(valorPorPeca);

                    listaFuncionarioPadrao.add(funcionarioProducao);

                    break;
                case 4:
                    ConsoleUtils.limparTela();
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