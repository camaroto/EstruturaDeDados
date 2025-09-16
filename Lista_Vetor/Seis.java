package Lista_Vetor;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = s.nextInt();
            }
        }

        int maior = matriz[0][0];
        int linhaMaior = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                }
            }
        }

        int minimax = matriz[linhaMaior][0];
        for (int j = 1; j < colunas; j++) {
            if (matriz[linhaMaior][j] < minimax) {
                minimax = matriz[linhaMaior][j];
            }
        }

        System.out.println("Elemento minimax da matriz: " + minimax);
        s.close();
    }
}
