package aula_20_08;

import java.util.Scanner;

public class QuatroVetores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];
        int D[] = new int[5];

        System.out.println("Informe os valores do Vetor A: ");
        for (int i = 0; i < 5; i++) {
            A[i] = s.nextInt();
        }

        System.out.println("Informe os valores do Vetor B: ");
        for (int i = 0; i < 5; i++) {
            B[i] = s.nextInt();
        }

        System.out.println("Informe os valores do Vetor C: ");
        for (int i = 0; i < 5; i++) {
            C[i] = s.nextInt();
        }

        System.out.println("Informe os valores do Vetor D: ");
        for (int i = 0; i < 5; i++) {
            D[i] = s.nextInt();
        }

        int Soma[] = { A[0] + B[0] + C[0] + D[0], A[1] + B[1] + C[1] + D[1], A[2] + B[2] + C[2] + D[2],
                A[3] + B[3] + C[3] + D[3], A[4] + B[4] + C[4] + D[4] };

        System.out.printf("A + B + C + D = { %d, %d, %d, %d, %d }", Soma[0], Soma[1], Soma[2], Soma[3], Soma[4]);
        s.close();
    }
}