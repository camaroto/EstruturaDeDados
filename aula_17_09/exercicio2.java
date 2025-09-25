package aula_17_09;

import java.util.Scanner;

public class Exercicio2 {

    static void lerNomes(String v[]) {
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = v.length;
        System.out.println("Digite o nome de 10 pessoas.");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Nome %d: ", i + 1);
            v[i] = teclado.nextLine();
        }
        // teclado.close(); // não fechar aqui!
    }

    static void mostrar(String v[]) {
        System.out.println("---------- Lista de nomes ----------");
        int tamanhoVetor = v.length;
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("%s   ", v[i]);
        }
        System.out.println("\n-----------------------------------");
    }

    static void troca(String v[], int atual, int proxima) {
        String aux = v[atual];
        v[atual] = v[proxima];
        v[proxima] = aux;
    }

    static void bubbleSort(String v[]) {
        int n = v.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (v[i].compareTo(v[i + 1]) > 0) {
                    troca(v, i, i + 1);
                    trocou = true;
                }
            }
            n--; // otimização: última posição já está ordenada
        } while (trocou);
    }

    public static void main(String[] args) {
        String nomes[] = new String[10];
        lerNomes(nomes);

        System.out.println("\nAntes da ordenação:");
        mostrar(nomes);

        bubbleSort(nomes);

        System.out.println("\nDepois da ordenação:");
        mostrar(nomes);
    }
}
