package Prova.Livro;

import java.util.Scanner;

public class ProgramaLivro {
    public static void main(String[] args) {
        Livro lv = new Livro();
        Scanner s = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n1 - Mudar título do livro");
            System.out.println("2 - Mudar Autor do livro");
            System.out.println("3 - Mudar Ano de publicação");
            System.out.println("4 - Exibir dados do livro");
            System.out.println("5 - Sair.");
            opcao = s.nextInt();

            if (opcao == 1) {
                lv.mudarTitulo();
            } else if (opcao == 2) {
                lv.mudarAutor();
            } else if (opcao == 3) {
                lv.anoLivro();
            } else if (opcao == 4) {
                lv.exibirDados();
            } else if (opcao == 5) {

            } else {
                System.out.println("Opção inválida");
            }
        }
        s.close();
    }
}
