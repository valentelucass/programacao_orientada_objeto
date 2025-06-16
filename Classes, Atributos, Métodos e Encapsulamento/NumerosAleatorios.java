import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String jogarNovamente;

        do {

            System.out.print("Digite o valor máximo que será sorteado: ");
            int limite = scanner.nextInt();
            int numeroSecreto = random.nextInt(limite) + 1;
            int palpite = 0;
            int tentativas = 0;
            int pontos = 100;

            while (palpite != numeroSecreto && tentativas < 10) {
                System.out.println("Digite seu palpite: ");
                palpite = scanner.nextInt();
                tentativas++;

                if (numeroSecreto > palpite) {
                    System.out.println("Está abaixo!");
                    pontos -= 10;
                } else if (numeroSecreto < palpite) {
                    System.out.println("Está acima!");
                    pontos -= 10;
                } else {
                    System.out.println("Parabéns, você acertou! " + tentativas + " tentativas.");
                    System.out.println("Sua pontuação final foi: " + pontos + " pontos.");
                }
            }

            if (tentativas == 10 && palpite != numeroSecreto) {
                System.out.println("Excedeu as tentativas! O número secreto era: " + numeroSecreto);
            }

            System.out.print("Quer jogar novamente? (s/n): ");
            jogarNovamente = scanner.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        scanner.close();
    }

}