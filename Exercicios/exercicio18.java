import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira os dois valores
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        // Verificar e escrever os valores em ordem crescente
        if (valor1 < valor2) {
            System.out.println("Em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Em ordem crescente: " + valor2 + ", " + valor1);
        }
    }
}
