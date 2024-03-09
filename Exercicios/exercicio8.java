import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        double valorOriginal = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble() / 100;

        double valorfinal = valorOriginal + (percentual * valorOriginal);

        System.out.println("novo salario: " + valorfinal);

    }
}


