package aula_15_09.ordenacao.SelectionSort;

public class SelectionSortExemplo1 {

    public static void selectionSort(int v[]) {
        int menor;
        for (int i = 0; i < v.length; i++) {
            menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            if (i != menor) {
                // troca(v, i, menor);
            }
        }
    }
}