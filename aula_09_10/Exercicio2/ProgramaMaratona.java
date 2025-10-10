package aula_09_10.Exercicio2;

import java.util.Scanner;

public class ProgramaMaratona {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("\n---------------------------");
        System.out.println("1 - Registrar chegada");
        System.out.println("2 - Buscar Atletas por categoria");
        System.out.println("3 - Sair");
        int opcao = s.nextInt();
        return opcao;
    }

    static Atleta registrarChegada() {
        Atleta atletaAtual = new Atleta();
        
        System.out.println("Qual o número de inscrição? ");
        atletaAtual.numeroInscricao = s.nextInt();
        s.nextLine();

        System.out.println("Qual o Nome? ");
        atletaAtual.nome = s.nextLine();

        System.out.println("Qual o tempo em minutos? ");
        atletaAtual.tempoEmMin = s.nextDouble();

        System.out.println("Qual a categoria do atleta? (infantil, adulto ou veterano)");
        atletaAtual.categoria = s.next();
        
        return atletaAtual;
    }

    static void buscarCategoria(Atleta at[], int qtdAtletas) {
        System.out.println("Digite a categoria que deseja buscar: ");
        String categoriaBusca = s.next();

        for (int i = 0; i < qtdAtletas; i++) {
            if (at[i].categoria.equalsIgnoreCase(categoriaBusca)) {
                System.out.println("Número: " + at[i].numeroInscricao);
                System.out.println("Nome: " + at[i].nome);
                System.out.println("Tempo: " + at[i].tempoEmMin);
                System.out.println("Categoria: " + at[i].categoria);
                System.out.println("--------------------");
            }
        }
    }

    public static void main(String[] args) {
        int opcao;
        int qtdAtletas = 0;

        Atleta at[] = new Atleta[20];

        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                at[qtdAtletas] = registrarChegada();
                qtdAtletas++;
            } else if (opcao == 2) {
                buscarCategoria(at, qtdAtletas);
            }
        } while (opcao != 3);

        System.out.println("Programa encerrado!");
    }
}
