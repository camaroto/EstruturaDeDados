package aula_09_10.TestandoInsertionSort;

import java.util.Scanner;

import aula_15_09.ordenacao.InsertionSort.InsertionSortExemplo1;

public class Programa {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {

        System.out.println("1 - Cadastrar Nome e numero");
        System.out.println("2 - Listar em ordem alfabetica");
        System.out.println("3 - Listar em ordem numerica");
        System.out.println("4 - Sair.");

        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Atributos cadastrar() {
        Atributos at = new Atributos();

        System.out.println("Informe o nome: ");
        at.nome = s.nextLine();

        System.out.println("Informe o numero: ");
        at.n = s.nextInt();
        s.nextLine();

        return at;
    }

    static void listarAlfabetica(Atributos v[], int pessoas) {
        System.out.println("Ordenacao alfabetica");
        System.out.printf("Nome\t\tNumero\n");
        for (int i = 0; i < pessoas; i++) {
            Atributos at = v[i];
            System.out.printf("%s\t\t%d\n", at.nome, at.n);
        }
    }

    static void InsertionSortAlfabetico(Atributos v[], int pessoas) {
        for (int i = 1; i < pessoas; i++) {
            Atributos atual = v[i];
            int j = i;
            while (j > 0 && atual.nome.compareToIgnoreCase(v[j - 1].nome) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void InsertionSort(Atributos v[], int pessoas) {
        for (int i = 1; i < pessoas; i++) {
            Atributos atual = v[i];
            int j = i;
            while (j > 0 && atual.n < v[j - 1].n) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarNormal(Atributos v[], int pessoas) {

        System.out.println("Ordenacao numerica");
        System.out.println("Nome\t\tNumero");
        for (int i = 0; i < pessoas; i++) {
            Atributos at = v[i];
            System.out.printf("%s\t\t%d\n", at.nome, at.n);
        }
    }


    public static void main(String[] args) {
        Atributos at = new Atributos();
        Atributos cadastrados[] = new Atributos[20];

        int total = 0;

        int opcao;

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                cadastrados[total] = cadastrar();
                total++;
            } else if (opcao == 2) {
                InsertionSortAlfabetico(cadastrados, total);
                listarAlfabetica(cadastrados, total);
            } else if (opcao == 3) {
                InsertionSort(cadastrados, total);
                listarNormal(cadastrados, total);
            }
        } while (opcao != 4);
    }
}
