import java.util.Scanner;

import

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("=========== Sistema de Folha de Pagamento ===========");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");
            System.out.println("Selecione uma opção:");
            Scanner leitor = new Scanner(System.in);
            int opcao;
            try {
                opcao = leitor.nextInt();

                if (opcao < 0) {
                    System.out.println("Digite apenas número válidos!");
                    continue;
                }
            } catch (Exception numException) {
                // TODO: handle exception
                System.out.println("Digite apenas número válidos!");
                continue;
            }
            switch (opcao) {
                case 1:
                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao();
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