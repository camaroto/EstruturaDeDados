package aula_15_09.ordenacao.SelectionSort;

public class SelectionSortExemplo1 {

    static void troca(int v[], int atual, int proximo) {
        int aux = v[atual];
        v[atual] = v[proximo];
        v[proximo] = aux;
    }

    static void selectionSort(int v[]) {
        int menor;
        for (int i = 0; i < v.length; i++) {
            menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                troca(v, i, menor);
            }
        }
    }

    public static void main(String[] args) {
        int vetor[] = { 23, 4, 67, -8, 21 };
        selectionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}