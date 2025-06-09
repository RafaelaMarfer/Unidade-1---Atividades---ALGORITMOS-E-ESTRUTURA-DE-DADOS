import java.util.Scanner;

public class VerificaCodigoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o código do produto
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        // Verifica se é par ou ímpar
        if (codigo % 2 == 0) {
            System.out.println("O código " + codigo + " é PAR.");
        } else {
            System.out.println("O código " + codigo + " é ÍMPAR.");
        }

        scanner.close();
    }
}
