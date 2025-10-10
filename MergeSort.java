
public class MergeSort {

    // 1. Método Principal que inicia a ordenação recursiva
    public static void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            // Encontra o ponto do meio do array
            int meio = inicio + (fim - inicio) / 2;

            // Ordena recursivamente a primeira metade (esquerda)
            mergeSort(array, inicio, meio);

            // Ordena recursivamente a segunda metade (direita)
            mergeSort(array, meio + 1, fim);

            // Mescla as duas metades ordenadas
            merge(array, inicio, meio, fim);
        }
    }

    // 2. Método de Mesclagem (Merge)
    private static void merge(int[] array, int inicio, int meio, int fim) {
        // Cria arrays temporários para as duas metades
        int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;

        int[] esquerda = new int[tamanhoEsquerda];
        int[] direita = new int[tamanhoDireita];

        // Copia os dados para os arrays temporários
        for (int i = 0; i < tamanhoEsquerda; ++i) {
            esquerda[i] = array[inicio + i];
        }
        for (int j = 0; j < tamanhoDireita; ++j) {
            direita[j] = array[meio + 1 + j];
        }

        // Variáveis de controle para percorrer os arrays temporários
        int i = 0; // Índice inicial do primeiro sub-array
        int j = 0; // Índice inicial do segundo sub-array
        int k = inicio; // Índice inicial do array mesclado

        // Mescla as duas sub-arrays de volta no array original
        while (i < tamanhoEsquerda && j < tamanhoDireita) {
            // Compara os elementos e insere o menor no array principal
            if (esquerda[i] <= direita[j]) {
                array[k] = esquerda[i];
                i++;
            } else {
                array[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia os elementos restantes da sub-array esquerda, se houver
        while (i < tamanhoEsquerda) {
            array[k] = esquerda[i];
            i++;
            k++;
        }

        // Copia os elementos restantes da sub-array direita, se houver
        while (j < tamanhoDireita) {
            array[k] = direita[j];
            j++;
            k++;
        }
    }
}
