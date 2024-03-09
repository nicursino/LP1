import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        double totalEleitores = scanner.nextDouble();

        System.out.println("Digite o número de votos brancos: ");
        double votosBrancos = scanner.nextDouble();

        System.out.println("Digite o número de votos nulos: ");
        double votosNulos = scanner.nextDouble();

        System.out.println("Digite o número de votos válidos: ");
        double votosValidos = scanner.nextDouble();

        double percentualBrancos = (votosBrancos / totalEleitores) * 100;
        double percentualNulos = (votosNulos / totalEleitores) * 100;
        double percentualValidos = (votosValidos / totalEleitores) * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    }
}


