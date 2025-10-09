package aula_17_09.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public void lerAlunos(Aluno v[]) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            Aluno aluno = new Aluno();

            System.out.printf("Digite o nome do aluno %d: ", i + 1);
            String nome = s.nextLine();
            aluno.atribuirNome(nome);

            System.out.println("Agora, digite as 4 notas do aluno:");
            for (int j = 0; j < 4; j++) {
                double nota = s.nextDouble();
                aluno.atribuirNota(nota, j);
            }
            s.nextLine(); // consumir quebra de linha
            v[i] = aluno; // <-- ADICIONA NO VETOR
        }
s.close();
    }

    static void insertionSort(Aluno v[]) {
        for (int i = 1; i < v.length; i++) {
            Aluno atual = v[i];
            int j = i - 1;

            while (j >= 0 && atual.calcularMedia() > v[j].calcularMedia()) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = atual;
        }
    }

    static void mostrar(Aluno v[]) {
        System.out.println("--------- Lista de Alunos --------- ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%s\t\t%.2f\n", v[i].pegarNome(), v[i].calcularMedia());
        }
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        Exercicio3 exercicio = new Exercicio3();

        exercicio.lerAlunos(alunos); // Lê os alunos
        insertionSort(alunos); // Ordena pela média (maior para menor)
        mostrar(alunos); // Mostra o resultado
    }
}
