import java.util.Scanner;

public class ContaBancaria {
    private int numeroDaConta;
    private String titular;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Valor inválido ou saldo insuficiente.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria minhaConta  = new ContaBancaria();
        minhaConta.setSaldo(1000.00);
        minhaConta.setNumeroDaConta(1010);
        minhaConta.setTitular("Lucas Andrade");
        String loginNovamente = ""; // Começa com "" (vazio)

        int opcao;

        do {

            System.out.println("--- BEM-VINDO AO BANCO VIRTUAL ---");
            System.out.println("Digite suas informações");
            System.out.print("Número da conta (1010): ");
            int numeroDigitado = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer, porque está indo logo para outra linha e dá erro
            System.out.print("Nome titular (Lucas Andrade): ");
            String titularDigitado = scanner.nextLine();

            if (numeroDigitado == 1010 && titularDigitado.equalsIgnoreCase("Lucas Andrade")) {
                System.out.println("Login efetuado com sucesso!");

                do {

                    System.out.println("Digite a opção: ");
                    System.out.println("1 - Depositar");
                    System.out.println("2 - Sacar");
                    System.out.println("3 - Consultar saldo");
                    System.out.println("0 - Sair");
                    opcao = scanner.nextInt();

                    switch (opcao) {

                        case 1:
                            System.out.println("Digite o valor para depositar: ");
                            double valorDeposito = scanner.nextDouble();
                            minhaConta.depositar(valorDeposito);
                            break;

                        case 2:
                            System.out.println("Digite o valor para sacar: ");
                            double valorSaque = scanner.nextDouble();
                            minhaConta.sacar(valorSaque);
                            break;

                        case 3:
                            System.out.println("Seu saldo atual é: R$" + minhaConta.getSaldo());
                            break;

                        case 0:
                            System.out.println("Saindo do sistema. Obrigado!");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                } while (opcao != 0);

            } else {
                System.out.println("Titular ou conta inválidos.");
                System.out.println("Quer tentar novamente? Digite (s/n):");
                loginNovamente = scanner.next();
            }
        } while (loginNovamente.equalsIgnoreCase("s"));



        scanner.close();
    }
}