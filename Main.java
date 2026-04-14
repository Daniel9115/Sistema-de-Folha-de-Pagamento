import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<FuncionarioPadrao> listaFuncionarioPadrao = new ArrayList<>();
        while (flag) {
            System.out.println("=========== Sistema de Folha de Pagamento ===========");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");
            System.out.println("===========      Selecione uma opção      ===========:");
            System.out.println("Opção: ");

            Scanner leitor = new Scanner(System.in);
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

            switch (opcao) {
                case 1:
                    System.out.print("Nome:");
                    String nome = leitor.next();

                    System.out.print("Matricula:");
                    Integer matricula = leitor.nextInt();

                    FuncionarioPadrao funcionarioPadrao = new FuncionarioPadrao();
                    funcionarioPadrao.setNome(nome);
                    funcionarioPadrao.setMatricula(matricula);

                    listaFuncionarioPadrao.add(funcionarioPadrao);


                    System.out.println(funcionarioPadrao.getSalarioBase());

                    break;
                case 4:
                    System.out.println("Total de pessoas cadastradas: " + listaFuncionarioPadrao.size());

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