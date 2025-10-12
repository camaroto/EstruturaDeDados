import aula_09_10.Exercicio2.Atleta;

public class InsertionSort {

    // para ordenar em ordem alfabetica (vetor com strings)
    static void InsertionSort(Atleta v[], int tamanhoAtual) {
        for (int i = 1; i < tamanhoAtual; i++) {
            Atleta atual = v[i];
            int j = i;
            while (j > 0 && atual.nome.compareTo(v[j - 1].nome) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    // para ordenar numeros inteiros
    static void InsertionSortInt(int v[], int tamanhoAtual) {
        for (int i = 1; i < tamanhoAtual; i++) {
            int atual = v[i];
            int j = i;
            while (j > 0 && atual < v[j - 1]) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

}
