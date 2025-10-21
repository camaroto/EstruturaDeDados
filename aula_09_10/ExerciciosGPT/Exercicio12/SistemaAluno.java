package aula_09_10.ExerciciosGPT.Exercicio12;

import java.util.Scanner;

public class SistemaAluno {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("\n1 - cadastrar alunos");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Buscar aluno");
        System.out.println("4 - sair");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Aluno cadastrarAluno(Aluno v[]) {
        Aluno al = new Aluno();

        System.out.print("Nome: ");
        al.nome = s.nextLine();

        System.out.print("Nota: ");
        al.nota = s.nextDouble();
        s.nextLine();

        return al;
    }

    static void InsertionSort(Aluno v[], int total) {
        for (int i = 1; i < total; i++) {
            Aluno atual = v[i];
            int j = i;
            while (j > 0 && atual.nome.compareToIgnoreCase(v[j - 1].nome) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }

    }

    static void listarAlunos(Aluno v[], int total) {

        if (total == 0) {
            System.out.println("nenhum aluno cadastrado ainda!");
            return;
        }

        System.out.println("--------Alunos de A-Z--------");
        System.out.println("Nome\t\t\tNota");
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            System.out.printf("%s\t\t\t%.2f\n", al.nome, al.nota);
        }
    }


    static int buscaBinaria(Aluno v[], int total, String nome) {
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
        Aluno alunos[] = new Aluno[20];
        int opcao;
        int total = 0;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                alunos[total] = cadastrarAluno(alunos);
                total++;
            } else if (opcao == 2) {
                InsertionSort(alunos, total);
                listarAlunos(alunos, total);
            } else if (opcao == 3) {
                InsertionSort(alunos, total);

                if (total == 0) {
                    System.out.println("nenhum aluno cadastrado ainda!");
                    continue;
                }

                System.out.print("Informe o nome do aluno: ");
                String nome = s.nextLine();
                int posicao = buscaBinaria(alunos, total, nome);

                if (posicao > -1) {
                    System.out.println("Alunos com o nome de " + nome + ":");
                    System.out.println("Nome\t\t\tNota");
                    int i = posicao;

                    while (i > 0 && alunos[i - 1].nome.equalsIgnoreCase(nome)) {
                        i--;
                    }

                    while (i < total && alunos[i].nome.equalsIgnoreCase(nome)) {
                        System.out.printf("%s\t\t\t%.2f\n", alunos[i].nome, alunos[i].nota);
                        i++;
                    }
                } else {
                    System.out.println("Nenhum Aluno encontrado com esse nome!");
                }
            }
        } while (opcao != 4);
    }
}
