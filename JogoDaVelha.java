import java.util.Scanner;

public class JogoDaVelha {
    static char[][] tabuleiro = new char[3][3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTabuleiro();
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            imprimirTabuleiro();
            System.out.println("Vez do jogador " + jogadorAtual);
            int linha, coluna;

            while (true) {
                System.out.print("Digite a linha (0, 1 ou 2): ");
                linha = scanner.nextInt();
                System.out.print("Digite a coluna (0, 1 ou 2): ");
                coluna = scanner.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                    if (tabuleiro[linha][coluna] == ' ') {
                        tabuleiro[linha][coluna] = jogadorAtual;
                        break;
                    } else {
                        System.out.println("Posição ocupada. Escolha outra.");
                    }
                } else {
                    System.out.println("Posição inválida. Tente novamente.");
                }
            }

            if (verificarVitoria(jogadorAtual)) {
                imprimirTabuleiro();
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate()) {
                imprimirTabuleiro();
                System.out.println("Empate!");
                jogoAtivo = false;
            } else {
                // Alterna o jogador
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // Inicializa o tabuleiro com espaços vazios
    public static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Imprime o tabuleiro
    public static void imprimirTabuleiro() {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }

    // Verifica se o jogador atual venceu
    public static boolean verificarVitoria(char jogador) {
        // Linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }

        // Diagonais
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }

        return false;
    }

    // Verifica se o jogo empatou (sem espaços vazios)
    public static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
