public class MaiorNotaMatriz {
    public static void main(String[] args) {
        // Matriz onde cada linha é um aluno e cada coluna é uma prova
        double[][] notas = {
            {7.5, 8.0, 6.5},
            {9.0, 5.0, 10.0},
            {8.7, 7.0, 9.2},
            {6.8, 7.8, 8.1}
        };

        double maiorNota = notas[0][0]; // Inicializa com a primeira nota

        // Percorre todas as linhas e colunas para encontrar a maior nota
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                }
            }
        }

        System.out.println("A maior nota da turma é: " + maiorNota);
    }
}
