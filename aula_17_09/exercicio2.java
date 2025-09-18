package aula_17_09;

import java.util.Scanner;

public class exercicio2 {

    public static void InsertionSort(String[] nomes) {
        for (int i = 1; i < nomes.length; i++) {
            String atual = nomes[i];
            int j;
            for (j = i; (j > 0) && (atual.compareToIgnoreCase(nomes[j - 1]) > 0); j--) {
                nomes[j] = nomes[j - 1];
            }
            nomes[j] = atual;
        }
    }

    public static void main(String[] args) {
        Scanner atumalaca = new Scanner(System.in);
        String nomes[] = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Informe o nome %d: ", i + 1);
            nomes[i] = atumalaca.nextLine();
        }

        InsertionSort(nomes);

        for (int j = 0; j < nomes.length; j++) {
            System.out.println(nomes[j]);
        }
        atumalaca.close();
    }
}