package aula_20_08;

import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        int somatoria = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int l = s.nextInt();

        System.out.println("Digite a quantidade de colunas: ");
        int c = s.nextInt();

        int Matriz[][] = new int[l][c];

        System.out.println("Informe os valores");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                Matriz[i][j] = s.nextInt();
            }
        }
        System.out.println("Valores informados: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%d   ", Matriz[i][j]);
                somatoria += Matriz[i][j];
            }
            System.out.println();
        }
        System.out.printf("Soma dos valores: %d", somatoria);

        s.close();
    }
}