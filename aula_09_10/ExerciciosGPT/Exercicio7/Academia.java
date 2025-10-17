package aula_09_10.ExerciciosGPT.Exercicio7;

import java.util.Scanner;

public class Academia {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar alunos cadastrados");
        System.out.println("3 - IMC medio da academia");
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

        System.out.print("Peso: ");
        al.peso = s.nextDouble();

        System.out.print("Altura: ");
        al.altura = s.nextDouble();
        s.nextLine();

        al.imc = al.peso / (al.altura * al.altura);

        return al;

    }

    static void InsertionSort(Aluno v[], int total) {
        for (int i = 1; i < total; i++) {
            Aluno atual = v[i];
            int j = i;
            while (j > 0 && atual.imc < v[j - 1].imc) {
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

        System.out.println("Nome\t\t\tIdade\t\t\tPeso\t\t\tAltura\t\t\tIMC");
        for (int i = 0; i < total; i++) {
            Aluno al = v[i];

            System.out.printf("%s\t\t\t%d\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", al.nome, al.idade, al.peso, al.altura,
                    al.imc);
        }
    }

    static void calcularImcAcademia(Aluno v[], int total) {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += v[i].imc;
        }

        double media = soma / total;
        System.out.printf("Media do IMC da academia: %.2f\n", media);
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
                calcularImcAcademia(alunos, total);
            }
        } while (opcao != 4);
    }
}
