package aula_14_08;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int somatoria = 0;

        int numeros[] = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = s.nextInt();
        }

        System.out.println("Números Digitados: ");
        for (int i = 0; i < 5; i++) {
            somatoria += numeros[i];
            System.out.println(numeros[i]);
        }
        System.out.printf("somatória = %d", somatoria);
        s.close();
    }
}

