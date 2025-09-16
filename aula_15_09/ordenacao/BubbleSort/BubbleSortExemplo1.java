package aula_15_09.ordenacao.BubbleSort;

public class BubbleSortExemplo1 {

    static void troca(int v[], int atual, int proximo) {
        int aux = v[atual];
        v[atual] = v[proximo];
        v[proximo] = aux;
    }

    static void bubblesort(int v[]) {
        int continua, fim;
        fim = v.length;
        do {
            continua = 0;
            for (int i = 0; i < fim - 1; i++) {
                if (v[i] > v[i + 1]) {
                    troca(v, i, i + 1);
                    continua = i;
                }
            }
            fim--;
        } while (continua != 0);
    }

    public static void main(String[] args) {
        int vetor[] = { 5, 10, 2, 7, -1, 3, 8 };
        bubblesort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}