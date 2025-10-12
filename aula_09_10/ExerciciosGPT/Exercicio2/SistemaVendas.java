package aula_09_10.ExerciciosGPT.Exercicio2;

import java.util.Scanner;

public class SistemaVendas {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Funcionario");
        System.out.println("2 - Ordenar por vendas");
        System.out.println("3 - Buscar por departamento");
        System.out.println("4 - Mostra ranking de vendas");
        System.out.println("5 - Sair");
        System.out.println("Sua opcao: ");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Funcionario cadastrarFuncionario(Funcionario v[]) {
        Funcionario fn = new Funcionario();

        System.out.println("Nome do funcionario: ");
        fn.nome = s.nextLine();

        System.out.println("id do funcionario: ");
        fn.id = s.nextInt();
        s.nextLine();

        System.out.println("Departamento: ");
        fn.departamento = s.nextLine();

        System.out.println("Vendas no mes: ");
        fn.vendasMes = s.nextDouble();

        return fn;
    }

    static void InsertionSort(Funcionario v[], int total) {
        for (int i = 1; i < total; i++) {
            Funcionario atual = v[i];
            int j = i;
            while (j > 0 && atual.vendasMes > v[j - 1].vendasMes) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void ordenarVendas(Funcionario v[], int total) {
        InsertionSort(v, total);

        System.out.println("Ordem de mais vendas no mes");
        System.out.println("Nome\t\tid\t\tDepartamento\t\tVendas no Mes");
        for (int i = 0; i < total; i++) {
            Funcionario fn = v[i];
            System.out.printf("%s\t\t%d\t\t%s\t\t\t%.2f\n", fn.nome, fn.id, fn.departamento, fn.vendasMes);
        }
    }

    static int buscaBinaria(Funcionario v[], int total, String departamento) {
        int inicio = 0, meio, fim = total - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (departamento.compareToIgnoreCase(v[meio].departamento) < 0) {
                fim = meio - 1;
            } else if (departamento.compareToIgnoreCase(v[meio].departamento) > 0) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1; // elemento não encontrado
    }

    static void dadosFuncionario(Funcionario fn) {
        System.out.println("Dados do funcionario: ");
        System.out.printf("Nome: %s\n", fn.nome);
        System.out.printf("id: %d\n", fn.id);
        System.out.printf("vendas no mes: %.2f\n", fn.vendasMes);
    }

    public static void main(String[] args) {
        Funcionario funcionarios[] = new Funcionario[20];

        int opcao;
        int total = 0;

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                funcionarios[total] = cadastrarFuncionario(funcionarios);
                total++;
            } else if (opcao == 2) {
                ordenarVendas(funcionarios, total);
            } else if (opcao == 3) {
                System.out.println("Informe o departamento");
                String departamento = s.nextLine();
                int posicao = buscaBinaria(funcionarios, total, departamento);
                if (posicao > -1) {
                    dadosFuncionario(funcionarios[posicao]);
                } else {
                    System.out.println("Departamento nao encontrado");
                }
            } else if (opcao == 4) {
                ordenarVendas(funcionarios, total);
            }
        } while (opcao != 5);
    }
}
