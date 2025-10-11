package aula_09_10.Exercicio2;

import java.util.Scanner;

class Atleta {
    int numeroInscricao;
    String nome;
    double tempoEmMinutos;
    String categoria;

    public Atleta(int numeroInscricao, String nome, double tempoEmMinutos, String categoria) {
        this.numeroInscricao = numeroInscricao;
        this.nome = nome;
        this.tempoEmMinutos = tempoEmMinutos;
        this.categoria = categoria;
    }

    public String toString() {
        return "Atleta{" +
                "numeroInscricao=" + numeroInscricao +
                ", nome='" + nome + '\'' +
                ", tempoEmMinutos=" + tempoEmMinutos +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

class AtletaManager {
    static final int MAX_ATLETAS = 20;
    static Atleta[] atletas = new Atleta[MAX_ATLETAS];
    static int contadorAtletas = 0;

    static void adicionarAtleta(Atleta atleta) {
        if (contadorAtletas < MAX_ATLETAS) {
            atletas[contadorAtletas] = atleta;
            contadorAtletas++;
            System.out.println("Atleta cadastrado com sucesso.");
        } else {
            System.out.println("Limite de atletas alcançado.");
        }
    }

    static void listarAtletas() {
        System.out.println("Lista de Atletas:");
        for (int i = 0; i < contadorAtletas; i++) {
            System.out.println(atletas[i]);
        }
    }

    static void buscaPorCategoria(String categoria) {
        boolean encontrou = false;
        System.out.println("Atletas da categoria " + categoria + ":");
        for (int i = 0; i < contadorAtletas; i++) {
            if (atletas[i].categoria.equalsIgnoreCase(categoria)) {
                System.out.println(atletas[i]);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum atleta encontrado na categoria " + categoria + ".");
        }
    }
}

class Menu {
    static void exibirMenu() {
        Scanner s = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar Atleta");
            System.out.println("2 - Listar Atletas");
            System.out.println("3 - Buscar Atletas por Categoria");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAtleta(s);
                    break;
                case 2:
                    AtletaManager.listarAtletas();
                    break;
                case 3:
                    System.out.print("Digite a categoria para busca (Juvenil, Adulto, Sênior): ");
                    String categoriaBusca = s.nextLine();
                    AtletaManager.buscaPorCategoria(categoriaBusca);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        s.close();
    }

    static void cadastrarAtleta(Scanner s) {
        System.out.println("\nDigite os dados do atleta:");
        System.out.print("Número de Inscrição: ");
        int numeroInscricao = s.nextInt();
        s.nextLine();
        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Tempo em minutos: ");
        double tempoEmMinutos = s.nextDouble();
        s.nextLine();
        System.out.print("Categoria (ex: Juvenil, Adulto, Sênior): ");
        String categoria = s.nextLine();

        Atleta atleta = new Atleta(numeroInscricao, nome, tempoEmMinutos, categoria);
        AtletaManager.adicionarAtleta(atleta);
    }
}

public class Main {
    public static void main(String[] args) {
        Menu.exibirMenu();
    }
}
