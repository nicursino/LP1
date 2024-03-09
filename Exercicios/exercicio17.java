import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira os dois valores
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        // Verificar qual valor é maior
        double maiorValor;

        if (valor1 > valor2) {
            maiorValor = valor1;
        } else {
            maiorValor = valor2;
        }

        // Imprimir o maior valor
        System.out.println("O maior valor é: " + maiorValor);
    }
}
