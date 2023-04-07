import java.util.Scanner;

public class CalculadoraTempoDownload {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o tamanho do arquivo em MB
        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scanner.nextDouble(); // Lê o tamanho do arquivo em MB digitado pelo usuário

        // Solicitar ao usuário que insira a velocidade do link de Internet em Mbps
        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeLinkMbps = scanner.nextDouble(); // Lê a velocidade do link de Internet em Mbps digitada pelo usuário

        // Cálculos
        double tamanhoArquivoBits = tamanhoArquivoMB * 8 * 1024 * 1024; // Converte o tamanho do arquivo de MB para bits
        double tempoDownloadMinutos = tamanhoArquivoBits / (velocidadeLinkMbps * 1024 * 1024); // Calcula o tempo de download em minutos

        // Exibir o resultado
        System.out.println("Tempo aproximado de download: " + tempoDownloadMinutos + " minutos");

        // Fechar o objeto Scanner
        scanner.close();
    }
}
