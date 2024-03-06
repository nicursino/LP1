import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira as notas
        System.out.println("Insira a nota P1:");
        double P1 = scanner.nextDouble();

        System.out.println("Insira a nota E1:");
        double E1 = scanner.nextDouble();

        System.out.println("Insira a nota E2:");
        double E2 = scanner.nextDouble();

        System.out.println("Insira a nota API:");
        double API = scanner.nextDouble();

        System.out.println("Insira a nota X:");
        double X = scanner.nextDouble();

        System.out.println("Insira a nota SUB:");
        double SUB = scanner.nextDouble();

        // Calcular a média de LP1
        double mediaLP1 = ((P1 * 0.6) + (((E1 + E2) / 2) * 0.4)) * 0.5 +
                          Math.max(((P1 * 0.6) + (((E1 + E2) / 2) * 0.4) - 5.9), 0) /
                          ((P1 * 0.6) + (((E1 + E2) / 2) * 0.4) - 5.9) * (API * 0.5) +
                          X + (SUB * 0.2);

        // Imprimir a média de LP1
        System.out.println("A média de LP1 do aluno é: " + mediaLP1);
    }
}


