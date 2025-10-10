package aula_09_10.Exercicio1;

import java.util.Scanner;

public class ProdutoEstoque {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {

        System.out.println("-------------------------");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos cadastrados");
        System.out.println("3 - Buscar Produto pelo código");
        System.out.println("4 - Sair");
        System.out.println("Informe sua opção: ");
        int opcao = s.nextInt();
        s.nextLine(); // limpar o ENTER pendente
        return opcao;

    }

    static Produto cadastrarProduto() {
        Produto p = new Produto();
        System.out.println("------------------------------");

        System.out.println("Informe o código do Produto: ");
        p.codigo = s.nextLine();

        System.out.println("Informe o Nome do Produto: ");
        p.nome = s.nextLine();

        System.out.println("Informe o preço do Produto: ");
        p.preco = s.nextDouble();

        System.out.println("Informe a quantidade em Estoque: ");
        p.quantidadeEstoque = s.nextInt();

        return p;
    }

    static void listarProdutos(Produto v[], int tamanhoAtual) {
        System.out.println("-----------------------");
        System.out.println("Listagem de produtos\n");
        System.out.println("Código\t\tNome\t\tPreco\t\tEstoque");
        for (int i = 0; i < tamanhoAtual; i++) {
            Produto produto = v[i];
            System.out.printf("%s\t\t%s\t\t%.2f\t\t%d\n", produto.codigo, produto.nome, produto.preco,
                    produto.quantidadeEstoque);
        }
        System.out.println("-----------------------");
    }

    static void insertionSort(Produto v[], int tamanho) {
        Produto atual;
        for (int i = 1; i < tamanho; i++) {
            atual = v[i];
            int j;
            for (j = i; (j > 0) && (atual.nome.compareTo(v[j - 1].nome) < 0); j--) {
                v[j] = v[j - 1];
            }
            v[j] = atual;
        }
    }

    static int buscaBinaria(Produto v[], int tamanho, String codigo) {
        int inicio = 0, meio, fim = tamanho - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (codigo.compareTo(v[meio].codigo) < 0) {
                fim = meio - 1;
            } else if (codigo.compareTo(v[meio].codigo) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1; // elemento não encontrado
    }

    static void verDadosProduto(Produto p) {
        System.out.println("Dados do produto:");
        System.out.printf("Codigo: %s\n", p.codigo);
        System.out.printf("Nome: %s\n", p.nome);
        System.out.printf("Preco: %.2f\n", p.preco);
        System.out.printf("Estoque: %d\n", p.quantidadeEstoque);
        s.nextLine();
    }

    public static void main(String[] args) {
        int tamanhoAtual = 0;
        Produto produtos[] = new Produto[20];
        int opcao;

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                Produto p = cadastrarProduto();
                produtos[tamanhoAtual] = p;
                tamanhoAtual++;
            } else if (opcao == 2) {
                listarProdutos(produtos, tamanhoAtual);
            } else if (opcao == 3) {
                System.out.print("Digite o codigo do produto: ");
                String codigo = s.next();
                int posicao = buscaBinaria(produtos, tamanhoAtual, codigo);
                if (posicao > -1) {
                    verDadosProduto(produtos[posicao]);
                }
            } else {
                System.out.println("Produto não encontrado!");
                s.nextLine();
            }
        } while (opcao != 4);
    }
}
