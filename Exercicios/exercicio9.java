import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o custo de fábrica do carro
        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        // Calcular o valor do distribuidor (28% do custo de fábrica)
        double valorDistribuidor = custoFabrica * 0.28;

        // Calcular o valor dos impostos (45% do custo de fábrica)
        double valorImpostos = custoFabrica * 0.45;

        // Calcular o custo final ao consumidor (soma do custo de fábrica, valor do distribuidor e valor dos impostos)
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        // Imprimir o custo final ao consumidor
        System.out.println("O custo final ao consumidor é de: R$" + custoFinal);
    }
}
