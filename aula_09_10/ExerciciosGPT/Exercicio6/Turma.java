package aula_09_10.ExerciciosGPT.Exercicio6;

import java.util.Scanner;

public class Turma {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar alunos cadastrados");
        System.out.println("3 - Mostrar medias");
        System.out.println("4 - Sair");
        int opcao = s.nextInt();
        s.nextLine();
        return opcao;
    }

    static Aluno cadastrarAluno(Aluno v[]) {
        Aluno al = new Aluno();

        System.out.print("Nome: ");
        al.nome = s.nextLine();

        System.out.print("Idade: ");
        al.idade = s.nextInt();
        s.nextLine();

        System.out.print("Nota: ");
        al.nota = s.nextDouble();

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
        System.out.println("Alunos cadastrados: ");
        System.out.println("Nome\t\t\tIdade\t\t\tNota");

        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            System.out.printf("%s\t\t\t%d\t\t\t%.2f\n", al.nome, al.idade, al.nota);
        }
    }

    static void mediaTurma(Aluno v[], int total) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];
            soma += al.nota;
            media = soma / total;
        }
        System.out.printf("A média da turma é de: %.2f\n", media);
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
                mediaTurma(alunos, total);
            }
        } while (opcao != 4);
    }
}
