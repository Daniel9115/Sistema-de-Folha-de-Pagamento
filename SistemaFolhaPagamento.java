import java.util.Scanner;

public class SistemaFolhaPagamento {

    public static void main(String[] args) {

        while (true) {
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
            switch (leitor) {
                case value:
                    
                    break;
            
                default:
                    break;
            }

        }
    }
}