package aula_09_10.ExerciciosGPT.Exercicio4;

import java.util.Scanner;

public class Oficina {
    static Scanner s = new Scanner(System.in);

    static int mostrarMenu() {
        System.out.println("---------------------------");
        System.out.println("1 - Registrar serviço");
        System.out.println("2 - Buscar serviço por tipo");
        System.out.println("3 - Listar todos os serviços");
        System.out.println("4 - Sair");
        System.out.println("---------------------------");
        System.out.print("Sua opção: ");
        int opcao = s.nextInt();
        s.nextLine();

        return opcao;
    }

    static Servico registrarServico(Servico v[]) {
        Servico sc = new Servico();

        System.out.println("Mecânico responsável");
        sc.mecanicoResponsavel = s.nextLine();

        System.out.println("Tipo de serviço");
        sc.tipo = s.nextLine();

        System.out.println("Descrição do serviço");
        sc.desc = s.nextLine();

        System.out.print("Valor: ");
        sc.valor = s.nextDouble();

        s.nextLine();

        return sc;

    }

    static void InsertionSort(Servico v[], int total) {
        for (int i = 1; i < total; i++) {
            Servico atual = v[i];
            int j = i;
            while (j > 0 && atual.mecanicoResponsavel.compareToIgnoreCase(v[j - 1].mecanicoResponsavel) < 0) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = atual;
        }
    }

    static void listarServicos(Servico v[], int total) {
        System.out.println("Mecanico\t\t\tTipo\t\t\tValor");
        for (int i = 0; i < total; i++) {
            Servico sc = v[i];
            System.out.printf("%s\t\t\t%s\t\t\t%.2f\n", sc.mecanicoResponsavel, sc.tipo, sc.valor);
        }
    }

    static void buscarPorTipo(Servico v[], int total, String tipo) {
        boolean encontrou = false;
        System.out.println("\nServiços encontrados:\n");
        System.out.println("Mecânico\t\tTipo\t\tValor\t\tDescrição");

        for (int i = 0; i < total; i++) {
            if (v[i].tipo.equalsIgnoreCase(tipo)) {
                Servico sc = v[i];
                System.out.printf("%s\t\t%s\t\t%.2f\t\t%s\n",
                        sc.mecanicoResponsavel, sc.tipo, sc.valor, sc.desc);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum serviço encontrado com esse tipo.");
        }
    }

    static void dados(Servico sc, int total) {
        for (int i = 0; i < total; i++) {
            System.out.println(sc);
        }
    }

    public static void main(String[] args) {
        Servico servicos[] = new Servico[20];
        int opcao;
        int total = 0;
        do {
            opcao = mostrarMenu();
            if (opcao == 1) {
                servicos[total] = registrarServico(servicos);
                total++;
            } else if (opcao == 2) {
                System.out.println("Informe o tipo de serviço: ");
                String tipo = s.nextLine();
                buscarPorTipo(servicos, total, tipo);
            } else if (opcao == 3) {
                InsertionSort(servicos, total);
                listarServicos(servicos, total);
            }
        } while (opcao != 4);
    }
}