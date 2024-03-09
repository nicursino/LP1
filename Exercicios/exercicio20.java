import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o número de horas trabalhadas em um mês e o salário por hora
        System.out.println("Digite o número de horas trabalhadas em um mês:");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o salário por hora:");
        double salarioHora = scanner.nextDouble();

        // Definir a jornada de trabalho semanal e o número de semanas em um mês
        int jornadaSemanal = 40;
        int semanasMes = 4;

        // Calcular o salário total sem horas extras
        double salarioSemExtras = horasTrabalhadas * salarioHora;

        // Verificar se houve horas extras
        if (horasTrabalhadas > jornadaSemanal * semanasMes) {
            // Calcular o número de horas extras
            double horasExtras = horasTrabalhadas - (jornadaSemanal * semanasMes);

            // Calcular o valor das horas extras (com acréscimo de 50%)
            double valorHorasExtras = horasExtras * salarioHora * 1.5;

            // Calcular o salário total com horas extras
            double salarioTotal = salarioSemExtras + valorHorasExtras;

            // Imprimir o salário total do funcionário
            System.out.println("O salário total do funcionário é: R$" + salarioTotal);
        } else {
            // Imprimir o salário total do funcionário sem horas extras
            System.out.println("O salário total do funcionário é: R$" + salarioSemExtras);
        }
    }
}
