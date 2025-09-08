package aula_04_09.TAD.ALUNO;

import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {
        Aluno ln = new Aluno();
        Scanner s = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n0 - Inserir nome do ALuno");
            System.out.println("1 - Atribuir NOta");
            System.out.println("2 - Mostrar Notas");
            System.out.println("3 - Calcular Média");
            System.out.println("4 - Mostra Media");
            System.out.println("5 - Sair.");
            opcao = s.nextInt();

            if (opcao == 0) {
                ln.nomeAluno();
            } else if (opcao == 1) {
                ln.atribuirNota();
            } else if (opcao == 2) {
                ln.mostrarNotas();
            } else if (opcao == 3) {
                ln.calcularMedia();
            } else if (opcao == 4) {
                ln.mostrarMedia();
            } else if (opcao == 5) {

            } else {
                System.out.println("Opção inválida.");
                main(args);
            }
        }
        s.close();
    }
}
