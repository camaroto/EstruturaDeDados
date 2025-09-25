package aula_15_09.ordenacao.InsertionSort;

public class InsertionSortExemplo1 {
    public static void InsertionSort(int v[]) {
        int atual;
        for (int i = 1; i < v.length; i++) {
            atual = v[i];
            int j;
            for (j = i; (j > 0) && (atual < v[j - 1]); j--) {
                v[j] = v[j - 1];
            }
            v[j] = atual;
        }
    }

    public static void main(String[] args) {
        int vetor[] = { 23, 4, -8, 81, 10 };
        InsertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
 