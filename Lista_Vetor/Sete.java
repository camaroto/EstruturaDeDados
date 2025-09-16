package Lista_Vetor;

import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = s.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = s.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = s.nextInt();
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
            s.close();
        }
    }
}
