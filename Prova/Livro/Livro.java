package Prova.Livro;

import java.util.Scanner;

public class Livro {
    Scanner s = new Scanner(System.in);

    String titulo, autor;
    int ano;

    public void mudarTitulo() {
        System.out.print("Qual o título do livro? ");
        titulo = s.nextLine();
    }

    public void mudarAutor() {
        System.out.print("Qual o nome do autor? ");
        autor = s.nextLine();
    }

    public int anoLivro() {
        System.out.print("Qual o ANO de lançamento? ");
        ano = s.nextInt();
        return ano;
    }

    public void exibirDados() {
        System.out.printf("Título: %s\nAutor: %s\nAno de Lançamento: %d", titulo, autor, ano);
    }
}
