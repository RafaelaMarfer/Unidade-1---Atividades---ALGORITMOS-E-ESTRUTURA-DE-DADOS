public class SistemaReservasHotel {
    public static void main(String[] args) {
        int numeroQuarto = 114;
        double valorDiaria = 250;
        String nomeHospede = "Paulo Lopes";

        System.out.println("Sistema de Reservas do Hotel");
        System.out.println("-----------------------------");
        System.out.println("Número do Quarto: " + numeroQuarto);
        System.out.printf("Valor da Diária: R$ %.2f%n", valorDiaria);
        System.out.println("Nome do Hóspede: " + nomeHospede);
    }
}
