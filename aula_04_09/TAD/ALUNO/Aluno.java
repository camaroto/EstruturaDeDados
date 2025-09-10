package aula_04_09.TAD.ALUNO;

import java.util.Scanner;

public class Aluno {
    Scanner s = new Scanner(System.in);
    
    String aluno;
    int nota;
    double notas[] = new double[4];

    public void nomeAluno() {
        System.out.print("\nNome: ");
        this.aluno = s.nextLine();
    }

    public void atribuirNota() {
        System.out.println("Informe as 4 notas do aluno: ");
        for (int i = 0; i < 4; i++) {
            this.notas[i] = s.nextDouble();
        }
    }

    public void mostrarNotas() {
        for (int i = 0; i < 4; i++) {
            System.out.printf("Nota %d: %.1f\n", i + 1, notas[i]);
        }
    }

    double assistenteMedia = 0;
    double media = 0;

    public void calcularMedia() {
        for (int i = 0; i < 4; i++) {
            assistenteMedia += this.notas[i];
            media = assistenteMedia / 4;
        }
        System.out.println("Média Calculada!\n");
    }

    public void mostrarMedia() {
        System.out.printf("\nA Média de %s é de %.1f\n", aluno, media);
    }
}