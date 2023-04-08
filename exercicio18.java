import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do arquivo em MB: ");
            double tamanho = scanner.nextDouble();

            System.out.print("Digite a velocidade do link de Internet em Mbps: ");
            double velocidade = scanner.nextDouble();

            double tempo = (tamanho * 8) / velocidade; // em segundos
            tempo = tempo / 60; // em minutos

            System.out.printf("O tempo aproximado de download do arquivo é de %.2f minutos", tempo);
        }
    }
}
