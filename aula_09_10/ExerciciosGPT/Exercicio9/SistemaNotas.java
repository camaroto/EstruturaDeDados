package aula_09_10.ExerciciosGPT.Exercicio9;

import java.util.Scanner;

public class SistemaNotas {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar alunos por nota");
        System.out.println("3 - Buscar alunos por nota");
        System.out.println("4 - Media geral da turma");
        System.out.println("5 - Sair");
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
            while (j > 0 && atual.nota < v[j - 1].nota) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarAlunos(Aluno v[], int total) {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.println("Nome\t\t\tNota");
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            System.out.printf("%s\t\t\t%.2f\n", al.nome, al.nota);
        }
    }

    static void mediaTurma(Aluno v[], int total) {
        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += v[i].nota;
        }
        double media = soma / total;
        System.out.printf("A media geral da turma eh de: %.2f\n", media);
    }

    static int buscaBinaria(Aluno v[], int total, double nota) {
        int inicio = 0, meio, fim = total - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (nota < v[meio].nota) {
                fim = meio - 1;
            } else if (nota > v[meio].nota) {
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
                System.out.print("Informe a nota: ");
                double nota = s.nextDouble();
                int posicao = buscaBinaria(alunos, total, nota);

                if (posicao > -1) {
                    System.out.println("Alunos com a nota " + nota + ":");

                    int i = posicao;

                    while (i > 0 && alunos[i - 1].nota == nota) {
                        i--;
                    }

                    while (i < total && alunos[i].nota == nota) {
                        System.out.printf("%s\t\t\t%.2f\n", alunos[i].nome, alunos[i].nota);
                        i++;
                    }

                } else{
                    System.out.println("Ninguem com essa nota");
                }

            } else if (opcao == 4) {
                mediaTurma(alunos, total);
            }

        } while (opcao != 5);
    }
}