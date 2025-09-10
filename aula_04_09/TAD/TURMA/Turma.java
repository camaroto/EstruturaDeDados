package aula_04_09.TAD.TURMA;

import java.util.Scanner;

public class Turma {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aluno ln = new Aluno();
        int opcao = -1;

        while (opcao != 8) {
            System.out.println("\n1 - Cadastrar nome");
            System.out.println("2 - Alunos Cadastrados");
            System.out.println("3 - Atribuir nota");
            System.out.println("4 - Calcular media");
            System.out.println("5 - Mostrar notas");
            System.out.println("6 - Mostrar Infos");
            System.out.println("7 - Media da TURMA");
            System.out.println("8 - Sair.");
            opcao = s.nextInt();

            if (opcao == 1) {
                ln.nomeAluno();
            } else if (opcao == 2) {
                ln.mostrarTurma();
            } else if (opcao == 3) {
                ln.atribuirNota();
            } else if (opcao == 4) {
                ln.calcularMedia();
            } else if (opcao == 5) {
                ln.mostrarNotas();
            } else if (opcao == 6) {
                ln.mostrarInfos();
            } else if (opcao == 7) {
                ln.mediaTurma();
            } else {
                System.out.println("Invalido");
                main(args);
            }
        }
    }
}