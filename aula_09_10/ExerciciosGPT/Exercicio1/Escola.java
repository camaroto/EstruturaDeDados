package aula_09_10.ExerciciosGPT.Exercicio1;

import java.util.Scanner;

public class Escola {
    static Scanner s = new Scanner(System.in);

    static int mostraMenu() {
        System.out.println("1 - Adicionar Aluno");
        System.out.println("2 - Listar por nota");
        System.out.println("3 - Listar por nome");
        System.out.println("4 - Buscar aluno por nome");
        System.out.println("5 - Sair");
        System.out.println("Sua opção: ");

        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Aluno adicionarAluno(Aluno v[]) {
        Aluno al = new Aluno();

        System.out.println("Nome do aluno: ");
        al.nome = s.nextLine();

        System.out.println("Numero de matricula: ");
        al.matricula = s.nextInt();

        System.out.println("Nota final do aluno: ");
        al.notaFinal = s.nextDouble();

        return al;
    }

    static void InsertionSortNota(Aluno v[], int total) {
        for (int i = 1; i < total; i++) {
            Aluno atual = v[i];
            int j = i;
            while (j > 0 && atual.notaFinal > v[j - 1].notaFinal) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarNota(Aluno v[], int total) {
        System.out.println("Alunos ordenados pela Nota");
        System.out.println("Nome\t\tMatricula\t\tNota Final");
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            System.out.printf("%s\t\t%d\t\t\t%.2f\n", al.nome, al.matricula, al.notaFinal);
        }
    }

    static void InsertionSortAlfabeto(Aluno v[], int total) {
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

    static void listarAlfabeto(Aluno v[], int total) {
        System.out.println("Alunos ordenados pelo nome");

        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado");
        }

        System.out.println("Alunos de A-Z");
        for (int i = 0; i < total; i++) {
            System.out.printf("Nome: %s\t\tNota: %.2f\n", v[i].nome, v[i].notaFinal);
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
        return -1; // elemento não encontrado
    }

    static void dadosAluno(Aluno al) {
        System.out.println("Dados do aluno");
        System.out.printf("Nome: %s\n", al.nome);
        System.out.printf("Matricula: %d\n", al.matricula);
        System.out.printf("Nota FInal: %.2f\n", al.notaFinal);

    }

    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[20];
        int opcao;
        int total = 0;

        do {
            opcao = mostraMenu();
            if (opcao == 1) {
                alunos[total] = adicionarAluno(alunos);
                total++;
            } else if (opcao == 2) {
                InsertionSortNota(alunos, total);
                listarNota(alunos, total);
            } else if (opcao == 3) {
                InsertionSortAlfabeto(alunos, total);
                listarAlfabeto(alunos, total);
            } else if (opcao == 4) {
                System.out.println("Informe o nome que deseja buscar: ");
                String nome = s.nextLine();
                int posicao = buscaBinaria(alunos, total, nome);
                if (posicao > -1) {
                    dadosAluno(alunos[posicao]);
                } else {
                    System.out.println("Aluno nao encontrado");
                }
            }
        } while (opcao != 5);
    }
}
