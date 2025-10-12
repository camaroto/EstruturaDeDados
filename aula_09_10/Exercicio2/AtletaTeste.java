package aula_09_10.Exercicio2;

import java.util.Scanner;

public class AtletaTeste {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Atleta");
        System.out.println("2 - Listar atletas por categoria");
        System.out.println("3 - Listar todos os atletas");
        System.out.println("4 - Sair.");
        System.out.println("Informe sua opcao: ");
        int opcao = s.nextInt();
        s.nextLine();// bagulho de buffer
        return opcao;
    }

    static Atleta cadastrarAtleta(String nome, String categoria, int numeroInscricao, double tempoEmMinutos) {

        Atleta atleta = new Atleta();

        System.out.println("informe o nome do atleta: ");
        atleta.nome = s.nextLine();

        System.out.println("informe a categoria do atleta (infantil, juvenil ou adulto): ");
        atleta.categoria = s.nextLine();

        System.out.println("informe o numero de inscricao do atleta: ");
        atleta.numeroInscricao = s.nextInt();

        System.out.println("informe o tempo em min: ");
        atleta.tempoEmMinutos = s.nextDouble();

        return atleta;
    }

    public static void listarCategoria(Atleta v[], int qntAtletas) {
        System.out.println("Qual categoria quer listar? (infantil, juvenil ou adulto)");
        String categoriaEscolhida = s.nextLine();

        System.out.println("numero de Inscricao\tNome\t\tCategoria\t\tTempo em Min");
        for (int i = 0; i < qntAtletas; i++) {
            Atleta atleta = v[i];

            if (atleta.categoria.equalsIgnoreCase(categoriaEscolhida)) {
                System.out.printf("%d\t\t\t%s\t\t\t%s\t\t\t%.2f\n",
                        atleta.numeroInscricao,
                        atleta.nome,
                        atleta.categoria,
                        atleta.tempoEmMinutos);
            }
        }
    }

    static void InsertionSort(Atleta v[], int tamanhoAtual) {
        for (int i = 1; i < tamanhoAtual; i++) {
            Atleta atual = v[i];
            int j = i;
            while (j > 0 &&
                    (atual.tempoEmMinutos < v[j - 1].tempoEmMinutos
                            || (atual.tempoEmMinutos == v[j - 1].tempoEmMinutos &&
                                    atual.nome.compareTo(v[j - 1].nome) > 0))) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarAtletas(Atleta v[], int tamanhoAtual) {
        System.out.println("numero de Inscricao\tNome\t\tCategoria\t\tTempo em Min");
        for (int i = 0; i < tamanhoAtual; i++) {
            Atleta atleta = v[i];
            System.out.printf("%d\t\t\t%s\t\t%s\t\t%.2f\n",
                    atleta.numeroInscricao,
                    atleta.nome,
                    atleta.categoria,
                    atleta.tempoEmMinutos);

        }
    }

    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        Atleta atletas[] = new Atleta[20];
        int opcao;
        int tamanhoAtual = 0;

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                atleta = cadastrarAtleta(atleta.nome, atleta.categoria, atleta.numeroInscricao, atleta.tempoEmMinutos);
                atletas[tamanhoAtual] = atleta;
                tamanhoAtual++;
            } else if (opcao == 2) {
                listarCategoria(atletas, tamanhoAtual);
            } else if (opcao == 3) {
                InsertionSort(atletas, tamanhoAtual);
                listarAtletas(atletas, tamanhoAtual);
            }
        } while (opcao != 4);
    }
}