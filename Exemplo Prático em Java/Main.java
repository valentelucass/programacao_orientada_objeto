import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("Olá, bem vindo ao banco digital. Vamos abrir uma conta.");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        conta.setDono(nome);

        System.out.print("Digite o tipo de conta (CC para corrente, CP para poupança): ");
        String tipo = scanner.nextLine().toUpperCase();
        conta.abrirConta(tipo);

        int opcao;

        do {
            System.out.println("-----------------------------");
            System.out.println("=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Pagar mensalidade");
            System.out.println("4 - Ver saldo");
            System.out.println("5 - Fechar conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    float valorDep = scanner.nextFloat();
                    conta.depositar(valorDep);
                    break;

                case 2:
                    System.out.println("Digite o valor do saque: ");
                    float valorSaq = scanner.nextFloat();
                    conta.sacar(valorSaq);
                    break;

                case 3:
                    conta.pagarMensal();
                    break;

                case 4:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;

                case 5:
                    conta.fecharConta();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
