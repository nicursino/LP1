import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura em Fahrenheit
        System.out.println("Digite a temperatura em Fahrenheit:");
        double temperaturaFahrenheit = scanner.nextDouble();

        // Calcular a temperatura em Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;

        // Imprimir a temperatura em Celsius
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + " °C");
    }
}
