package aula_17_09.execicio3;

import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        int qtdAlunos = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Atribuir notas a todos os alunos");
            System.out.println("3 - Mostrar lista de alunos ordenada por média");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir enter

            switch (opcao) {
                case 1: // cadastrar aluno
                    if (qtdAlunos < alunos.length) {
                        System.out.print("Nome do aluno: ");
                        String nome = sc.nextLine();
                        alunos[qtdAlunos] = new Aluno(nome);
                        qtdAlunos++;
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de 10 alunos atingido.");
                    }
                    break;

                case 2: // atribuir notas a todos
                    if (qtdAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }
                    for (int i = 0; i < qtdAlunos; i++) {
                        System.out.println("\nAtribuindo notas para: " + alunos[i].getNome());
                        for (int j = 1; j <= 4; j++) {
                            System.out.print("Nota do " + j + "º bimestre: ");
                            double nota = sc.nextDouble();
                            alunos[i].atribuirNota(j, nota);
                        }
                    }
                    sc.nextLine(); // consumir enter
                    break;

                case 3: // mostrar lista ordenada por média
                    if (qtdAlunos == 0) {
                        System.out.println("Nenhum aluno cadastrado!");
                        break;
                    }
                    // Ordenação por média decrescente (Insertion Sort)
                    for (int i = 1; i < qtdAlunos; i++) {
                        Aluno atual = alunos[i];
                        double mediaAtual = atual.calcularMedia();
                        int j;
                        for (j = i; j > 0 && alunos[j - 1].calcularMedia() < mediaAtual; j--) {
                            alunos[j] = alunos[j - 1];
                        }
                        alunos[j] = atual;
                    }
                    // int atual;
                    // for (int i = 1; i < v.length; i++) {
                    // atual = v[i];
                    // int j;
                    // for (j = i; (j > 0) && (atual < v[j - 1]); j--) {
                    // v[j] = v[j - 1];
                    // }
                    // v[j] = atual;
                    // }
                    // }

                    System.out.println("\n=== Lista de Alunos por Média Decrescente ===");
                    for (int i = 0; i < qtdAlunos; i++) {
                        alunos[i].mostrarMedia();
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
