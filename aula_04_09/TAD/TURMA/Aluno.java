package aula_04_09.TAD.TURMA;

import java.util.Scanner;

public class Aluno {

    String aluno[] = new String[44];
    double Notas[][] = new double[44][4];
    int qntAlunos = 0;
    Scanner s = new Scanner(System.in);

    public void nomeAluno() {
        if (qntAlunos < aluno.length) {
            System.out.print("Nome: ");
            aluno[qntAlunos] = s.nextLine();
            System.out.printf("Aluno cadastrado na posição %d", qntAlunos);
            qntAlunos++;
        } else {
            System.out.println("Maximo de alunos\n");
        }
    }

    public void mostrarTurma() {
        for (int i = 0; i < 44; i++) {
            if (aluno[i] != null) {
                System.out.printf("Aluno %d: %s\n", i, aluno[i]);
            }
        }
    }

    public void atribuirNota() {
        System.out.println("informe o numero do aluno (de 0 ate 43)");
        int indice = s.nextInt();
        if (aluno[indice] != null) {
            if (indice >= 0 && indice < aluno.length) {
                for (int i = 0; i < 4; i++) {
                    System.out.printf("Aluno: %s / Nota %d: ", aluno[indice], i + 1);
                    Notas[indice][i] = s.nextDouble();
                }
            } else {
                System.out.println("aluno invalido");
            }
        } else {
            System.out.println("aluno nao cadastrado");
        }
    }

    public void mostrarNotas() {
        System.out.println("informe o numero do aluno (de 0 ate 43)");
        int indice = s.nextInt();
        if (indice >= 0 && indice < aluno.length) {
            System.out.printf("Notas do aluno %d\n", indice);
            for (int i = 0; i < 4; i++) {
                System.out.printf("Nota %d: %.1f\n", i + 1, Notas[indice][i]);
            }
        } else {
            System.out.println("aluno invalido");
        }
    }

    double Media[][] = new double[44][1];
    double assistenteMedia = 0;

    public void calcularMedia() {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] != null) {
                double soma = 0;
                for (int j = 0; j < 4; j++) {
                    soma += Notas[i][j];
                }
                double media = soma / 4;
                System.out.printf("Media do aluno %s: %.1f\n", aluno[i], media);
            }
        }
    }

    public void mostrarInfos() {
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] != null) {
                double soma = 0;
                for (int j = 0; j < 4; j++) {
                    soma += Notas[i][j];
                }
                double media = soma / 4;
                System.out.printf("Aluno: %s, Notas %.1f, %.1f, %.1f, %.1f, Media: %.1f\n", aluno[i], Notas[i][0],
                        Notas[i][1], Notas[i][2], Notas[i][3], media);
            }
        }
    }

    public void mediaTurma() {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < aluno.length; i++) {
            if (aluno[i] != null) {
                for (int j = 0; j < 4; j++) {
                    soma += Notas[i][j];
                    media = soma / qntAlunos;
                }
            }
        }
        System.out.printf("a soma das notas da turma eh de: %.1f", media);
    }
}