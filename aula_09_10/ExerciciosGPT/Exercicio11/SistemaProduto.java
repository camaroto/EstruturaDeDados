package aula_09_10.ExerciciosGPT.Exercicio11;

import java.util.Scanner;

public class SistemaProduto {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - cadastrar produto");
        System.out.println("2 - Listar produtos por preco");
        System.out.println("3 - Buscar produto por nome");
        System.out.println("4 - mostra o preco medio dos produtos");
        System.out.println("5 - sair");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Produto cadastrarProduto(Produto v[]) {
        Produto p = new Produto();

        System.out.print("Nome: ");
        p.nome = s.nextLine();
        System.out.print("Categoria: ");
        p.categoria = s.nextLine();
        System.out.print("Preco: ");
        p.preco = s.nextDouble();
        s.nextLine();
        return p;
    }

    static void InsertionSort(Produto v[], int total) {
        for (int i = 1; i < total; i++) {
            Produto atual = v[i];
            int j = i;
            while (j > 0 && atual.preco < v[j - 1].preco) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarProdutos(Produto v[], int total) {
        if (total == 0) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("Nome\t\tCategoria\t\tPreco");

        for (int i = 0; i < total; i++) {
            Produto p = v[i];
            System.out.printf("%s\t\t%s\t\t%.2f\n", p.nome, p.categoria, p.preco);
        }
    }

    static int buscaBinaria(Produto v[], int total, String nome) {
        int inicio = 0, meio, fim = total - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (nome.compareToIgnoreCase(v[meio].nome) < 0) {
                fim = meio - 1;
            } else if (nome.compareToIgnoreCase(v[meio].nome) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1;
    }

    static void InsertionSortNome(Produto v[], int total) {
        for (int i = 1; i < total; i++) {
            Produto atual = v[i];
            int j = i;
            while (j > 0 && atual.nome.compareToIgnoreCase(v[j - 1].nome) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void mostrarMedia(Produto v[], int total) {

        if (total == 0) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += v[i].preco;
        }
        double media = soma / total;
        System.out.printf("A media do preco dos produtos eh de: %.2f\n", media);
    }

    public static void main(String[] args) {
        int opcao;
        int total = 0;
        Produto produtos[] = new Produto[20];

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                produtos[total] = cadastrarProduto(produtos);
                total++;
            } else if (opcao == 2) {
                InsertionSort(produtos, total);
                listarProdutos(produtos, total);
            } else if (opcao == 3) {
                InsertionSortNome(produtos, total);
                System.out.print("Informe o nome do produto: ");
                String nome = s.nextLine();
                int posicao = buscaBinaria(produtos, total, nome);

                if (posicao > -1) {
                    System.out.println("Produtos com o nome " + nome + ":");
                    System.out.println("Nome\t\tCategoria\t\tPreco");
                    int i = posicao;

                    while (i > 0 && produtos[i - 1].nome.equalsIgnoreCase(nome)) {
                        i--;
                    }

                    while (i < total && produtos[i].nome.equalsIgnoreCase(nome)) {
                        System.out.printf("%s\t\t%s\t\t%.2f\n", produtos[i].nome, produtos[i].categoria,
                                produtos[i].preco);
                        i++;
                    }
                } else {
                    System.out.println("Produto nao encontrado");
                }
            } else if (opcao == 4) {
                mostrarMedia(produtos, total);
            }
        } while (opcao != 5);
    }
}
