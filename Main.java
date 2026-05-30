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

                    System.out.println("Sucesso: " + nome + " Matricula: " + matricula);

                    listaFuncionarioPadrao.add(funcionarioPadrao);

                    break;

                case 2:
                    dadosPadrao = dadosPadrao(leitor);

                    nome = dadosPadrao.get(0);
                    matricula = Integer.parseInt(dadosPadrao.get(1));

                    double totalValor = lerDoublePositivo(leitor, "Informe valor das vendas: ");
                    double percentual = lerDoublePositivo(leitor, "Informe comissão percentual: ");
                    FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(nome, matricula,
                            totalValor, percentual);

                    listaFuncionarioPadrao.add(funcionarioComissionado);

                    break;
                case 3:
                    dadosPadrao = dadosPadrao(leitor);

                    nome = dadosPadrao.get(0);
                    matricula = Integer.parseInt(dadosPadrao.get(1));

                    int quantidadeProduzida = lerIntPositivo(leitor, "Informe qtde de peças: ");
                    double valorPorPeca = lerDoublePositivo(leitor, "Informe valor da peça: ");

                    FuncionarioProducao funcionarioProducao = new FuncionarioProducao(nome, matricula, valorPorPeca,
                            quantidadeProduzida);

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

        do {
            System.out.print("Nome: ");
            nome = leitor.nextLine().trim();
            if (nome.isEmpty())
                System.out.println("Nome não pode ser vazio!");
        } while (nome.isEmpty());

        matricula = lerIntPositivo(leitor, "Matricula: ");

        valores.add(nome);
        valores.add(String.valueOf(matricula));

        return valores;
    }

    public static double lerDoublePositivo(Scanner leitor, String mensagem) {
        double valor;
        do {
            System.out.print(mensagem);
            while (!leitor.hasNextDouble()) {
                System.out.println("Digite apenas números válidos!");
                leitor.nextLine();
                System.out.print(mensagem);
            }
            valor = leitor.nextDouble();
            if (valor < 0)
                System.out.println("O valor não pode ser negativo!");
        } while (valor < 0);
        leitor.nextLine();
        return valor;
    }

    public static int lerIntPositivo(Scanner leitor, String mensagem) {
        int valor;
        do {
            System.out.print(mensagem);
            while (!leitor.hasNextInt()) {
                System.out.println("Digite apenas números válidos!");
                leitor.nextLine();
                System.out.print(mensagem);
            }
            valor = leitor.nextInt();
            if (valor < 0)
                System.out.println("O valor não pode ser negativo!");
        } while (valor < 0);
        leitor.nextLine();
        return valor;
    }

}