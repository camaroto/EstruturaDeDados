
public class QuickSort {

    // 1. Método Principal que inicia a ordenação recursiva
    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            // Chama o método de particionamento para encontrar a posição final do pivô
            int indicePivo = particionar(array, inicio, fim);

            // Ordena recursivamente o sub-array à esquerda do pivô
            quickSort(array, inicio, indicePivo - 1);

            // Ordena recursivamente o sub-array à direita do pivô
            quickSort(array, indicePivo + 1, fim);
        }
    }

    // 2. Método de Particionamento (Divide o array em duas partes)
    private static int particionar(int[] array, int inicio, int fim) {
        // Escolhe o pivô (aqui, o último elemento)
        int pivo = array[fim];

        // i é o índice do menor elemento e indica a posição correta do pivô
        int i = (inicio - 1);

        // Percorre o array do 'inicio' até o 'fim - 1'
        for (int j = inicio; j < fim; j++) {
            // Se o elemento atual for menor ou igual ao pivô
            if (array[j] <= pivo) {
                i++;

                // Troca array[i] e array[j]
                trocar(array, i, j);
            }
        }

        // Troca o pivô (array[fim]) com o elemento em array[i+1].
        // Isso coloca o pivô na sua posição final correta.
        trocar(array, i + 1, fim);

        // Retorna o índice onde o pivô foi colocado
        return i + 1;
    }

    // Método auxiliar para realizar a troca de elementos
    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
