package aula_04_09.TAD.ALUNO;

import java.util.Scanner;

public class Aluno {
    Scanner s = new Scanner(System.in);

    String aluno;
    Double nota[] = new Double[3];

    void atribuirNota(Double nota) {
        System.out.println("Informe as notas:");
        for (int i = 0; i < 3; i++) {
            nota[i] = s.nextDouble();
        }
    }
}
