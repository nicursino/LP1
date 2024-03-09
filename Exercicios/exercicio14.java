import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o número de maçãs compradas
        System.out.println("Digite o número de maçãs compradas:");
        int numMacas = scanner.nextInt();

        double custoTotal;

        // Verificar se o número de maçãs é menor do que uma dúzia
        if (numMacas < 12) {
            // Se sim, calcular o custo total da compra (R$ 1,30 por maçã)
            custoTotal = numMacas * 1.30;
        } else {
            // Se não, calcular o custo total da compra (R$ 1,00 por maçã)
            custoTotal = numMacas * 1.00;
        }

        // Imprimir o custo total da compra
        System.out.println("O custo total da compra é de: R$" + custoTotal);
    }
}
