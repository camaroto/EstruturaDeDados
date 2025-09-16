package Lista_Vetor;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamanho = 10;
        int[] original = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para original[" + i + "] = ");
            original[i] = s.nextInt();
        }

        int count = 0;
        for (int i = 0; i < tamanho; i++) {
            if (original[i] % 5 == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Não existem valores múltiplos de cinco no vetor original.");
        } else {
            int[] multiplos = new int[count];
            int j = 0;
            for (int i = 0; i < tamanho; i++) {
                if (original[i] % 5 == 0) {
                    multiplos[j] = original[i];
                    j++;
                }
            }

            System.out.print("Vetor com múltiplos de cinco: [");
            for (int i = 0; i < multiplos.length; i++) {
                System.out.print(multiplos[i]);
                if (i < multiplos.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        s.close();
    }
}
