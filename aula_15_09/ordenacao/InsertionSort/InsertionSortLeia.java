package aula_15_09.ordenacao.InsertionSort;

import java.util.Scanner;

public class InsertionSortLeia {
    public static void InsertionSort(int v[]) {
        System.out.println("numeros ordenados:");
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
        Scanner s = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite um número");
            vetor[i] = s.nextInt();
        }

        InsertionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        s.close();
    }
}
