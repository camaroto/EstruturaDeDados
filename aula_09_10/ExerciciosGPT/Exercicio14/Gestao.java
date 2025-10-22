package aula_09_10.ExerciciosGPT.Exercicio14;

import java.util.Scanner;

public class Gestao {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("=====================================");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar todos os alunos");
        System.out.println("3 - Listar alunos por curso");
        System.out.println("4 - Buscar aluno pelo nome");
        System.out.println("5 - Listar alunos por media");
        System.out.println("6 - Mostrar a media geral da turma");
        System.out.println("7 - Sair");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Aluno cadastrarAluno(Aluno v[]) {
        System.out.println("=====================================");
        Aluno al = new Aluno();
        System.out.print("Nome: ");
        al.nome = s.nextLine();
        System.out.print("Curso: ");
        al.curso = s.nextLine();
        System.out.print("Nota 1: ");
        al.nota1 = s.nextDouble();
        System.out.print("Nota 2: ");
        al.nota2 = s.nextDouble();
        al.media = (al.nota1 + al.nota2) / 2;
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
        System.out.println("=====================================");
        System.out.println("Alunos em ordem alfabetica");
        System.out.println("Nome\t\tCurso\t\tN1\t\tN2\t\tMedia");
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            System.out.printf("%s\t\t%s\t\t%.2f\t\t%.2f\t\t%.2f\n", al.nome, al.curso, al.nota1, al.nota2, al.media);
        }
    }

    static void InsertionSortMedia(Aluno v[], int total) {
        for (int i = 1; i < total; i++) {
            Aluno atual = v[i];
            int j = i;
            while (j > 0 && atual.media < v[j - 1].media) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarAlunosMedia(Aluno v[], int total) {
        System.out.println("=====================================");
        System.out.println("Alunos por Média (menor → maior)");

        System.out.println("Nome\t\tCurso\t\tMedia");
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            System.out.printf("%s\t\t%s\t\t%.2f\n", al.nome, al.curso, al.media);
        }
    }

    static void buscarCurso(Aluno v[], int total, String curso) {
        System.out.println("=====================================");
        int cont = 0;
        System.out.println("alunos cadastrado no curso: " + curso);
        System.out.println("Nome\t\tMedia");
        for (int i = 0; i < total; i++) {
            if (v[i].curso.equalsIgnoreCase(curso)) {
                System.out.printf("%s\t\t%.2f\n", v[i].nome, v[i].media);
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("Nenhum aluno encontrado nesse curso");
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

    static void InsertionSortNome(Aluno v[], int total) {
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

    static void mostrarMediaGeral(Aluno v[], int total) {

        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += v[i].media;
        }
        double media = soma / total;
        System.out.printf("A media geral dos alunos eh de: %.2f\n", media);
    }

    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[50];
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

                if (total == 0) {
                    System.out.println("Nenhum aluno cadastrado");
                    continue;
                }

                System.out.print("Informe o nome do curso: ");
                String curso = s.nextLine();
                buscarCurso(alunos, total, curso);
            } else if (opcao == 4) {

                if (total == 0) {
                    System.out.println("Nenhum aluno cadastrado");
                    continue;
                }

                InsertionSortNome(alunos, total);
                System.out.print("Digite o nome: ");
                String nome = s.nextLine();
                int posicao = buscaBinaria(alunos, total, nome);

                if (posicao > -1) {
                    System.out.println("Alunos com o nome de:" + nome);
                    System.out.println("\nNome\t\tCurso\t\tMedia");

                    int i = posicao;

                    while (i > 0 && alunos[i - 1].nome.equalsIgnoreCase(nome)) {
                        i--;
                    }

                    while (i < total && alunos[i].nome.equalsIgnoreCase(nome)) {
                        System.out.printf("%s\t\t%s\t\t%.2f\n", alunos[i].nome, alunos[i].curso, alunos[i].media);
                        i++;
                    }
                } else {
                    System.out.println("Aluno nao encontrado");
                }
            } else if (opcao == 5) {
                if (total == 0) {
                    System.out.println("Nenhum aluno cadastrado");
                    continue;
                }
                InsertionSortMedia(alunos, total);
                listarAlunosMedia(alunos, total);
            } else if (opcao == 6) {
                mostrarMediaGeral(alunos, total);
            }
        } while (opcao != 7);
    }
}