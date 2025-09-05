package aula_21_08;

import java.util.Scanner;

public class VetorMultiCinco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a quantidade de Números do vetor: ");
        int n = s.nextInt();

        int VetorNormal[] = new int[n];

        System.out.println("Informe os números: ");
        for (int i = 0; i < n; i++) {
            VetorNormal[i] = s.nextInt();
        }

        int VetorMultiCinco[] = new int[n];

        System.out.println("Números multiplos de Cinco: ");

        boolean encontrou = false;

        for (int i = 0; i < n; i++) {

            if (VetorNormal[i] % 5 == 0) {

                VetorMultiCinco[i] = VetorNormal[i];
                System.out.printf("%d   ", VetorMultiCinco[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não tem Múltiplos de cinco");
        }
        s.close();
    }
}
