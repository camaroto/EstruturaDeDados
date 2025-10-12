package aula_09_10.Exercicio3;

import java.util.Scanner;

public class Agenda {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {

        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Listar Contatos");
        System.out.println("3 - Buscar Contato Por Nome");
        System.out.println("4 - Sair");

        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Contato adicionarContato() {
        Contato c = new Contato();

        System.out.printf("Nome do contato: ");
        c.nomeCompleto = s.nextLine();
        System.out.printf("Numero de telefone: ");
        c.telefone = s.nextLine();
        System.out.printf("E-mail: ");
        c.email = s.nextLine();

        return c;
    }

    static void listarContatos(Contato v[], int total) {
        System.out.println("Nome\t\tTelefone\t\tEmail");

        for (int i = 0; i < total; i++) {
            Contato c = v[i];
            System.out.printf("%s\t\t%s\t\t%s\t\t\n", c.nomeCompleto, c.telefone, c.email);
        }
    }

    static void InsertionSort(Contato v[], int total) {
        for (int i = 1; i < total; i++) {
            Contato atual = v[i];
            int j = i;
            while (j > 0 && atual.nomeCompleto.compareToIgnoreCase(v[j - 1].nomeCompleto) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static int buscaBinaria(Contato v[], int tamanho, String nome) {
        int inicio = 0, meio, fim = tamanho - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (nome.compareToIgnoreCase(v[meio].nomeCompleto) < 0) {
                fim = meio - 1;
            } else if (nome.compareToIgnoreCase(v[meio].nomeCompleto) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1; // elemento não encontrado
    }

    static void verDadosContato(Contato c) {
        System.out.println("Dados do Contato");
        System.out.printf("Nome: %s\n", c.nomeCompleto);
        System.out.printf("Telefone: %s\n", c.telefone);
        System.out.printf("Email: %s\n", c.email);
    }

    public static void main(String[] args) {
        Contato contatos[] = new Contato[20];

        int total = 0;

        int opcao;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                contatos[total] = adicionarContato();
                total++;
                InsertionSort(contatos, total);
            } else if (opcao == 2) {
                InsertionSort(contatos, total);
                listarContatos(contatos, total);
            } else if (opcao == 3) {
                InsertionSort(contatos, total);
                System.out.print("Digite o nome: ");
                String nome = s.next();
                int posicao = buscaBinaria(contatos, total, nome);
                if (posicao > -1) {
                    verDadosContato(contatos[posicao]);
                } else {
                    System.out.println("Contato nao encontrado!");
                }
            }
        } while (opcao != 4);
    }
}