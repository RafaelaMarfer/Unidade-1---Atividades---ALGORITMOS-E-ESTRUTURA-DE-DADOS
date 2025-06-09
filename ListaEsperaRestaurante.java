import java.util.ArrayList;
import java.util.Scanner;

public class ListaEsperaRestaurante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaEspera = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== Lista de Espera do Restaurante ===");
            System.out.println("1. Adicionar cliente à lista de espera");
            System.out.println("2. Remover cliente da lista de espera");
            System.out.println("3. Exibir lista de espera");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer após ler número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    listaEspera.add(nomeCliente);
                    System.out.println("Cliente adicionado com sucesso.");
                    exibirLista(listaEspera);
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente a remover: ");
                    String clienteRemover = scanner.nextLine();
                    if (listaEspera.remove(clienteRemover)) {
                        System.out.println("Cliente removido com sucesso.");
                    } else {
                        System.out.println("Cliente não encontrado na lista.");
                    }
                    exibirLista(listaEspera);
                    break;

                case 3:
                    exibirLista(listaEspera);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirLista(ArrayList<String> lista) {
        System.out.println("\n--- Lista Atualizada ---");
        if (lista.isEmpty()) {
            System.out.println("A lista de espera está vazia.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + ". " + lista.get(i));
            }
        }
    }
}
