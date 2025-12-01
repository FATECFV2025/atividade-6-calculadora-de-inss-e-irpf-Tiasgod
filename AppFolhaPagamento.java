import java.util.Scanner;

public class AppFolhaPagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário bruto: ");
        double salario = sc.nextDouble();

        System.out.println("\nEscolha o tipo do contribuinte:");
        System.out.println("1 - Funcionário CLT");
        System.out.println("2 - Estagiário");
        System.out.println("3 - Prestador de Serviço (PJ)");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        Contribuinte pessoa = null;

        switch (opcao) {
            case 1:
                pessoa = new FuncionarioCLT(nome, cpf, salario);
                break;
            case 2:
                pessoa = new Estagiario(nome, cpf, salario);
                break;
            case 3:
                pessoa = new PessoaJuridica(nome, cpf, salario);
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.println("\nInformações do Funcionário: ");
        System.out.print("Cargo: " + pessoa + "\n");
        System.out.print("CPF: " + cpf + "\n");
        pessoa.exibirResumo();
    }
}
