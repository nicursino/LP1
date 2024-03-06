public class exercicio4 {
    public static void main(String[] args) {
        // Gastos de cada mês
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        // Calculando o gasto total no trimestre
        int gastoTotal = gastoJaneiro + gastoFevereiro + gastoMarco;

        // Calculando a média mensal de gastos
        double mediaMensal = (double) gastoTotal / 3;

        // Imprimindo os resultados
        System.out.println("Gasto total no trimestre: " + gastoTotal + " reais");
        System.out.println("Média mensal de gastos: " + mediaMensal + " reais");
    }
}

