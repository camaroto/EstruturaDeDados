package aula_20_08;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int Matriz[][] = new int[3][2];

        System.out.println("Digite 6 numeros: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                Matriz[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d   ", Matriz[i][j]);
            }
            System.out.println();
        }
        s.close();
    }
}