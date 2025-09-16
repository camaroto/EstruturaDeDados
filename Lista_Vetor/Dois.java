package Lista_Vetor;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamanho = 5;
        double[] temperaturas = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Temperatura[" + i + "] = ");
            temperaturas[i] = s.nextDouble();
        }

        double menor = temperaturas[0];
        for (int i = 1; i < tamanho; i++) {
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        System.out.print("Temperaturas digitadas: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(temperaturas[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Menor temperatura: " + menor + "ºC");
        s.close();
    }
}
