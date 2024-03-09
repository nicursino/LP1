import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um valor
        System.out.println("Digite um valor:");
        double valor = scanner.nextDouble();

        // Verificar se o valor é positivo ou negativo
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }
    }
}


