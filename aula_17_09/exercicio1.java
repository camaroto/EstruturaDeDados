package aula_17_09;

import java.util.Scanner;

public class Exercicio1 {

    public static void InsertionSort(double[] peso) {
        for (int i = 1; i < peso.length; i++) {
            double atual = peso[i];
            int j;
            for (j = i; (j > 0) && (atual < peso[j - 1]); j--) {
                peso[j] = peso[j - 1];
            }
            peso[j] = atual;
        }
    }

    public static void main(String[] args) {
        Scanner atumalaca = new Scanner(System.in);
        double peso[] = new double[15];

        for (int i = 0; i < peso.length; i++) {
            System.out.printf("Informe o peso %d: ", i + 1);
            peso[i] = atumalaca.nextDouble();
        }

        InsertionSort(peso);

        for (int j = 0; j < peso.length; j++) {
            System.out.println(peso[j]);
        }
        atumalaca.close();
    }
}