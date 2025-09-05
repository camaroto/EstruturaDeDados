package aula_20_08;

import java.util.Scanner;

public class StringVetor {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe a capacidade do vetor: ");
        int n = s.nextInt();

        String Vetor[] = new String[n];

        System.out.println("\nInforme os valores: ");
        for (int i = 0; i < n; i++) {
            Vetor[i] = s.next();
        }

        System.out.println("\nValores informados: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: %s\n", Vetor[i]);
        }
    }
}
