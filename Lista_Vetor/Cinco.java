package Lista_Vetor;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = s.nextInt();
            }
        }

        // Imprimir matriz
        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Maior elemento de cada linha
        System.out.println("\nMaior elemento de cada linha:");
        for (int i = 0; i < 5; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 5; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Linha " + i + ": " + maior);
        }

        // Média de cada coluna
        System.out.println("\nMédia de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += matriz[i][j];
            }
            double media = soma / 5.0;
            System.out.println("Coluna " + j + ": " + media);
        }

        // Contar elementos negativos
        int negativos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }
        System.out.println("\nQuantidade de elementos negativos: " + negativos);
        s.close();
    }
}
