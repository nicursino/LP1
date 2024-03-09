import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um valor
        System.out.println("Digite um valor:");
        int valor = scanner.nextInt();

        // Verificar se o valor é maior que 10 e imprimir a mensagem correspondente
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}

