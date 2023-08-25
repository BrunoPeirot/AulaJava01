import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("\nResultado para " + nome + ":");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + imc);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
