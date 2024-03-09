import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a hora de início e a hora de término do jogo de xadrez
        System.out.println("Digite a hora de início do jogo (apenas horas inteiras):");
        int horaInicio = scanner.nextInt();

        System.out.println("Digite a hora de término do jogo (apenas horas inteiras):");
        int horaFim = scanner.nextInt();

        // Calcular a duração do jogo
        int duracao;

        if (horaFim > horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = horaFim - horaInicio + 24;
        }

        // Imprimir a duração do jogo
        System.out.println("A duração do jogo foi de " + duracao + " horas.");
    }
}
