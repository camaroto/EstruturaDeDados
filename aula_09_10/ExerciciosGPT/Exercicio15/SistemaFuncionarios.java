package aula_09_10.ExerciciosGPT.Exercicio15;

import java.util.Scanner;

public class SistemaFuncionarios {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("\n1 - Cadastrar funcionário");
        System.out.println("2 - Listar todos os funcionários (ordem alfabética)");
        System.out.println("3 - Buscar funcionário pelo nome (busca binária)");
        System.out.println("4 - Listar funcionários por cargo");
        System.out.println("5 - Listar funcionários por salário (menor > maior)");
        System.out.println("6 - Mostrar média salarial da empresa");
        System.out.println("7 - Sair");
        System.out.print("Sua opcao: ");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Funcionario cadastrarFuncionario(Funcionario v[]) {
        Funcionario fc = new Funcionario();
        System.out.print("Nome: ");
        fc.nome = s.nextLine();
        System.out.print("Idade: ");
        fc.idade = s.nextInt();
        s.nextLine();
        System.out.print("Cargo: ");
        fc.cargo = s.nextLine();
        System.out.print("Salario: ");
        fc.salario = s.nextDouble();
        s.nextLine();
        return fc;

    }

    static void InsertionSort(Funcionario v[], int total) {
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

    static void listarFucionarios(Funcionario v[], int total) {
        if (total == 0) {
            System.out.println("Nenhum funcionario cadastrado");
            return;
        }

        System.out.println("----------------");
        System.out.println("Nome\t\tIdade\t\tCargo\t\tSalario");

        for (int i = 0; i < total; i++) {
            Funcionario fc = v[i];
            System.out.printf("%s\t\t%d\t\t%s\t\t%.2f\n", fc.nome, fc.idade, fc.cargo, fc.salario);
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

    static void listarCargo(Funcionario v[], int total) {

        if (total == 0) {
            System.out.println("Nenhum funcionario cadastrado");
            return;
        }

        int cont = 0;
        System.out.print("Digite o cargo: ");
        String cargoBusca = s.nextLine();

        System.out.println("------------------------");
        System.out.println("Nome\t\tCargo\t\tSalario");
        for (int i = 0; i < total; i++) {
            if (v[i].cargo.equalsIgnoreCase(cargoBusca)) {
                System.out.printf("%s\t\t%s\t\t%.2f\n", v[i].nome, v[i].cargo, v[i].salario);
            }
            cont++;
        }
        System.out.println("------------------------");

        if (cont == 0) {
            System.out.println("Nenhum Funcionario com esse cargo");

        }

    }

    static void InsertionSortSalario(Funcionario v[], int total) {
        for (int i = 1; i < total; i++) {
            Funcionario atual = v[i];
            int j = i;
            while (j > 0 && atual.salario < v[j - 1].salario) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarSalarios(Funcionario v[], int total) {

        if (total == 0) {
            System.out.println("Nenhum Funcionario Cadastrado");
            return;
        }
        System.out.println("Nome\t\tCargo\t\tSalario");

        for (int i = 0; i < total; i++) {
            Funcionario fc = v[i];
            System.out.printf("%s\t\t%s\t\t%.2f\n", fc.nome, fc.cargo, fc.salario);
        }

    }

    static void mostrarMedia(Funcionario v[], int total) {
        double soma = 0;

        for (int i = 0; i < total; i++) {
            soma += v[i].salario;
        }
        double media = soma / total;
        System.out.printf("A media salarial eh de %.2f\n", media);

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
                InsertionSort(funcionarios, total);
                listarFucionarios(funcionarios, total);
            } else if (opcao == 3) {

                if (total == 0) {
                    System.out.println("-----------------");
                    System.out.println("Nenhum funcionario cadastrado");
                    continue;
                }

                System.out.println("-----------------");
                System.out.print("Digite o nome do funcionario: ");
                String nome = s.nextLine();

                int posicao = buscaBinaria(funcionarios, total, nome);

                if (posicao > -1) {
                    System.out.println("Funcionarios encontrados com o nome: " + nome);
                    System.out.println("Nome\t\tIdade\t\tCargo\t\tSalario");
                    int i = posicao;

                    while (i > 0 && funcionarios[i - 1].nome.equalsIgnoreCase(nome)) {
                        i--;
                    }

                    while (i < total && funcionarios[i].nome.equalsIgnoreCase(nome)) {
                        System.out.printf("%s\t\t%d\t\t%s\t\t%.2f\n", funcionarios[i].nome,
                                funcionarios[i].idade, funcionarios[i].cargo, funcionarios[i].salario);
                        i++;
                    }
                } else {
                    System.out.println("Nenhum funcionario com esse nome");
                }
            } else if (opcao == 4) {
                listarCargo(funcionarios, total);
            } else if (opcao == 5) {
                InsertionSortSalario(funcionarios, total);
                listarSalarios(funcionarios, total);
            } else if (opcao == 6) {
                mostrarMedia(funcionarios, total);
            }
        } while (opcao != 7);
    }
}
