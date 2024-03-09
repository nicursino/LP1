import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o número de carros vendidos, o valor total das vendas, o salário fixo e a comissão por carro vendido
        System.out.println("Digite o número de carros vendidos:");
        int numCarrosVendidos = scanner.nextInt();

        System.out.println("Digite o valor total das vendas:");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite a comissão por carro vendido:");
        double comissaoPorCarro = scanner.nextDouble();

        // Calcular o valor da comissão por vendas (5% do valor total das vendas)
        double comissaoPorVendas = 0.05 * valorTotalVendas;

        // Calcular o salário final do vendedor (salário fixo + comissão por carro vendido + comissão por vendas)
        double salarioFinal = salarioFixo + (numCarrosVendidos * comissaoPorCarro) + comissaoPorVendas;

        // Imprimir o salário final do vendedor
        System.out.println("O salário final do vendedor é de: R$" + salarioFinal);
    }
}
