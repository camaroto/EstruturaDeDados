package Prova.Contador;

import java.util.Scanner;

public class ProgramaContador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contador ct = new Contador();

        int opcao = -1;
        while (opcao != 5) {
            System.out.println("\n1 - Incrementar valor");
            System.out.println("2 - Decrementar valor");
            System.out.println("3 - Obter valor atual");
            System.out.println("4 - Sair.");
            opcao = s.nextInt();

            if (opcao == 1) {
                ct.incrementar();
            } else if (opcao == 2) {
                ct.decrementar();
            } else if (opcao == 3) {
                ct.obterValorAtual();
            } else if (opcao == 4) {

            } else {
                System.out.println("Opcao invalida.");
            }
        }
        s.close();
    }
}
