package aula_20_08;

import java.util.Scanner;

public class StringMatriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a quantidade de Linhas");
        int l = s.nextInt();

        System.out.println("Informe a quantidade de Colunas");
        int c = s.nextInt();

        String Matriz[][] = new String[l][c];

        System.out.println("Escreva o Name: ");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                Matriz[i][j] = s.next();
            }
        }

        System.out.println();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("%s   ", Matriz[i][j]);
            }
            System.out.println();
        }
        s.close();
    }
}
