package aula_09_10.ExerciciosGPT.Exercicio3;

import java.util.Scanner;

public class Biblioteca {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {

        System.out.println("1. Adicionar livro");
        System.out.println("2. Ordenar por Titulo");
        System.out.println("3. Ordenar por Ano");
        System.out.println("4. Buscar livro por autor");
        System.out.println("5. Sair");
        System.out.print("Sua opcao: ");

        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Livro adicionarLivro(Livro v[]) {
        Livro l = new Livro();

        System.out.println("Nome do livro");
        l.titulo = s.nextLine();

        System.out.println("Nome do autor");
        l.autor = s.nextLine();

        System.out.println("Ano de publicacao");
        l.anoPublicacao = s.nextInt();

        return l;
    }

    static void ordenarTitulo(Livro v[], int total) {
        System.out.println("Livros A-Z");

        System.out.println("Nome\t\tAutor\t\tAno");
        for (int i = 0; i < total; i++) {
            Livro l = v[i];
            System.out.printf("%s\t\t%s\t\t%d\n", l.titulo, l.autor, l.anoPublicacao);

        }
    }

    static void InsertionSort(Livro v[], int total) {
        for (int i = 1; i < total; i++) {
            Livro atual = v[i];
            int j = i;
            while (j > 0 && atual.titulo.compareToIgnoreCase(v[j - 1].titulo) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void InsertionSortAutor(Livro v[], int total) {
        for (int i = 1; i < total; i++) {
            Livro atual = v[i];
            int j = i;
            while (j > 0 && atual.autor.compareToIgnoreCase(v[j - 1].autor) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void ordenarAno(Livro v[], int total) {
        System.out.println("Livros ordenados Pelo ano de publicacao");
        System.out.println("Nome\t\tAutor\t\tAno");
        for (int i = 0; i < total; i++) {
            Livro l = v[i];
            System.out.printf("%s\t\t%s\t\t%d\n", l.titulo, l.autor, l.anoPublicacao);

        }
    }

    static void InsertionSortAno(Livro v[], int total) {
        for (int i = 1; i < total; i++) {
            Livro atual = v[i];
            int j = i;
            while (j > 0 && atual.anoPublicacao < v[j - 1].anoPublicacao) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static int buscaBinaria(Livro v[], int total, String nome) {
        int inicio = 0, meio, fim = total - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (nome.compareToIgnoreCase(v[meio].autor) < 0) {
                fim = meio - 1;
            } else if (nome.compareToIgnoreCase(v[meio].autor) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1; // elemento não encontrado
    }

    static void dados(Livro l) {
        System.out.printf("Livros de %s\n", l.autor);
        System.out.printf("Titulo\t\tAno\n");
        System.out.printf("%s\t\t%d\n", l.titulo, l.anoPublicacao);
    }

    public static void main(String[] args) {
        Livro livros[] = new Livro[20];

        int opcao;
        int total = 0;

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                livros[total] = adicionarLivro(livros);
                total++;
            } else if (opcao == 2) {
                InsertionSort(livros, total);
                ordenarTitulo(livros, total);
            } else if (opcao == 3) {
                InsertionSortAno(livros, total);
                ordenarAno(livros, total);
            } else if (opcao == 4) {
                InsertionSortAutor(livros, total);
                System.out.println("Nome do autor: ");
                String nome = s.nextLine();
                int posicao = buscaBinaria(livros, total, nome);
                if (posicao > -1) {
                    dados(livros[posicao]);
                } else {
                    System.out.println("Autor nao encontrado.\n");
                }
            }
        } while (opcao != 5);
    }
}
