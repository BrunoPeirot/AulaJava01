import java.util.Scanner;

public class Jogo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCorreto = 10000;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 10000.");

        System.out.print("Digite um número: ");
        int tentativa = scanner.nextInt();

        if (tentativa < numeroCorreto) {
            System.out.println("Um pouco mais.");
        } else if (tentativa > numeroCorreto) {
            System.out.println("Um pouco menos.");
        } else {
            System.out.println("Acertou. Parabéns!");
        }
    }
}




