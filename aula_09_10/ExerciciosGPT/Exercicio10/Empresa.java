package aula_09_10.ExerciciosGPT.Exercicio10;

import java.util.Scanner;

public class Empresa {

    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Funcionario");
        System.out.println("2 - Listar Funcionarios");
        System.out.println("3 - Buscar Funcionario");
        System.out.println("4 - Sair");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Funcionario cadastrarFuncionario(Funcionario v[]) {
        Funcionario fn = new Funcionario();

        System.out.print("Nome: ");
        fn.nome = s.nextLine();

        System.out.print("Cargo: ");
        fn.cargo = s.nextLine();

        System.out.print("Salario: ");
        fn.salario = s.nextDouble();
        s.nextLine();

        return fn;
    }

    static void InsertioSort(Funcionario v[], int total) {
        for (int i = 1; i < total; i++) {
            Funcionario atual = v[i];
            int j = i;
            while (j > 0 && atual.nome.compareToIgnoreCase(v[j - 1].nome) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarFuncionarios(Funcionario v[], int total) {
        System.out.println("Funcionario\t\t\tCargo\t\t\tSalario");
        for (int i = 0; i < total; i++) {
            Funcionario fn = v[i];
            System.out.printf("%s\t\t\t\t%s\t\t\t\t%.2f\n", fn.nome, fn.cargo, fn.salario);
        }
    }

    static int buscaBinaria(Funcionario v[], int total, String nome) {
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
                InsertioSort(funcionarios, total);
                listarFuncionarios(funcionarios, total);
            } else if (opcao == 3) {
                System.out.print("Informe o nome do Funcionario: ");
                String nome = s.nextLine();
                int posicao = buscaBinaria(funcionarios, total, nome);

                if (posicao > -1) {
                    System.out.println("Funcionarios com o nome de: " + nome);
                    System.out.println("Nome\t\t\tCargo\t\t\tSalario");

                    int i = posicao;

                    while (i > 0 && funcionarios[i - 1].nome.equalsIgnoreCase(nome)) {
                        i--;
                    }

                    while (i < total && funcionarios[i].nome.equalsIgnoreCase(nome)) {
                        System.out.printf("%s\t\t\t%s\t\t\t%.2f\n", funcionarios[i].nome, funcionarios[i].cargo, funcionarios[i].salario);
                        i++;
                    }

                }
            }
        } while (opcao != 4);
    }
}
