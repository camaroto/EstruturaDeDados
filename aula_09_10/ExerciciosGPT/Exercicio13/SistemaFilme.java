package aula_09_10.ExerciciosGPT.Exercicio13;

import java.util.Scanner;

public class SistemaFilme {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("\n1 - Cadastrar filme  ");
        System.out.println("2 - Listar filmes por nota (do menor para o maior)  ");
        System.out.println("3 - Buscar filme por título  ");
        System.out.println("4 - Mostrar a média das notas dos filmes  ");
        System.out.println("5 - Sair");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Filme cadastrarFilme(Filme v[]) {
        Filme fm = new Filme();
        System.out.print("Titulo: ");
        fm.titulo = s.nextLine();
        System.out.print("Genero: ");
        fm.genero = s.nextLine();
        System.out.print("Nota: ");
        fm.nota = s.nextDouble();
        s.nextLine();
        return fm;
    }

    static void InsertionSortNota(Filme v[], int total) {
        for (int i = 1; i < total; i++) {
            Filme atual = v[i];
            int j = i;
            while (j > 0 && atual.nota < v[j - 1].nota) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarFilmes(Filme v[], int total) {
        if (total == 0) {
            System.out.println("Nenhum filme cadastrado ainda");
            return;
        }
        System.out.println("Titulo\t\t\tGenero\t\t\tNota");
        for (int i = 0; i < total; i++) {
            Filme fm = v[i];
            System.out.printf("%s\t\t\t%s\t\t\t%.2f\n", fm.titulo, fm.genero, fm.nota);
        }
    }

    static void InsertionSortTitulo(Filme v[], int total) {
        for (int i = 1; i < total; i++) {
            Filme atual = v[i];
            int j = i;
            while (j > 0 && atual.titulo.compareToIgnoreCase(v[j - 1].titulo) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static int buscaBinaria(Filme v[], int total, String titulo) {
        int inicio = 0, meio, fim = total - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (titulo.compareToIgnoreCase(v[meio].titulo) < 0) {
                fim = meio - 1;
            } else if (titulo.compareToIgnoreCase(v[meio].titulo) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1;
    }

    static void mostraMedia(Filme v[], int total){

        if (total == 0) {
            System.out.println("Nenhum filme cadastrado");
            return;
        }

        double soma = 0;
        for (int i = 0; i < total; i++) {
            Filme fm = v[i];
            soma += v[i].nota;
        }
        double media = soma / total;
        System.out.printf("A media das notas dos filmes sao: %.2f\n", media);
    }

    public static void main(String[] args) {
        Filme filmes[] = new Filme[20];
        int opcao;
        int total = 0;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                filmes[total] = cadastrarFilme(filmes);
                total++;
            } else if (opcao == 2) {
                InsertionSortNota(filmes, total);
                listarFilmes(filmes, total);
            } else if (opcao == 3) {
                if (total == 0) {
                    System.out.println("Nenhum filme cadastrado ainda");
                    continue;
                }

                InsertionSortTitulo(filmes, total);
                System.out.print("Informe o titulo do filme: ");
                String titulo = s.nextLine();
                int posicao = buscaBinaria(filmes, total, titulo);

                if (posicao > -1) {
                    System.out.println("Filmes Encontrados:");
                    System.out.println("Nome\t\t\tGenero\t\t\tNota");

                    int i = posicao;
                    while (i > 0 && filmes[i - 1].titulo.equalsIgnoreCase(titulo)) {
                        i--;
                    }

                    while (i < total && filmes[i].titulo.equalsIgnoreCase(titulo)) {
                        System.out.printf("%s\t\t\t%s\t\t\t%.2f\n", filmes[i].titulo, filmes[i].genero, filmes[i].nota);
                        i++;
                    }

                } else {
                    System.out.println("Filme nao encontrado!");
                }

            } else if (opcao == 4) {
                mostraMedia(filmes, total);
            }
        } while (opcao != 5);
    }
}
