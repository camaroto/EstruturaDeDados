package Lista_Vetor;

import java.util.Scanner;

public class Quatro {

    public static int[] transformarVetor(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                B[i] = A[i] * 5;
            } else {
                B[i] = A[i] + 5;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamanho = 6;
        int[] A = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para A[" + i + "] = ");
            A[i] = s.nextInt();
        }

        int[] B = transformarVetor(A);

        System.out.print("Vetor B: [");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        s.close();
    }
}
