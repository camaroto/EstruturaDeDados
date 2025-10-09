package aula_08_10.Busca.Binaria.Aluno;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        
        int opcao = -1;

        while (opcao != 3) {
            System.out.println("1 - Cadastrar 10 alunos");
            System.out.println("2 - Buscar aluno");
            System.out.println("3 - Sair.");

            opcao = s.nextInt();
            s.nextLine();

            if (opcao == 1) {
                for (int i = 0; i < 10; i++) {
                    Aluno aluno = new Aluno();
                    System.out.printf("Digite o nome do aluno %d: ", i + 1);
                    String nome = s.nextLine();
                    aluno.atribuirNome(nome);

                    System.out.println("Agora, digite as 4 notas do aluno:");
                    for (int j = 0; j < 4; j++) {
                        double nota = s.nextDouble();
                        aluno.atribuirNota(nota, j);
                    }
                    s.nextLine();
                    alunos[i] = aluno;
                }
            } else if(opcao == 2){
                System.out.println("Digite o nome do aluno a buscar");
                String nomeBusca = s.nextLine();
                boolean encontrado = false;

                for(Aluno aluno : alunos){
                    if (aluno != null && aluno.pegarNome().equalsIgnoreCase(nomeBusca)) {
                        System.out.println("\nAluno Encontrado!");
                        System.out.println("Nome: " + aluno.pegarNome());
                        aluno.mostrarNotas();
                        aluno.mostrarMedia();
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Aluno não encontrado");
                }
            }
        }

        s.close();
        System.out.println("Programa encerrado");
    }
}
