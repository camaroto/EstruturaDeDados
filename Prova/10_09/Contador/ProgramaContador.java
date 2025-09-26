import java.util.Scanner;

import aula_27_08.TAD.Contato;

public class ProgramaContador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contato ct = new Contato();

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
                ct.incrementar();
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
