import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o ano atual
        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();

        // Solicitar ao usuário que insira o ano de nascimento
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        // Calcular a idade da pessoa
        int idade = anoAtual - anoNascimento;

        // Verificar se a pessoa pode votar (idade maior ou igual a 16 anos)
        if (idade >= 16) {
            System.out.println("Você poderá votar este ano!");
        } else {
            System.out.println("Você não poderá votar este ano!");
        }
    }
}
