import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira as notas da 1ª e 2ª avaliações
        System.out.println("Digite a nota da 1ª avaliação:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação:");
        double nota2 = scanner.nextDouble();

        // Calcular a média aritmética simples
        double media = (nota1 + nota2) / 2;

        // Verificar se o aluno foi aprovado (nota maior ou igual a 6)
        if (media >= 6) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Infelizmente, você não foi aprovado.");
        }

        // Imprimir a média calculada
        System.out.println("Sua média foi: " + media);
    }
}
