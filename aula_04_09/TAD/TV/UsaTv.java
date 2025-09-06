package aula_04_09.TAD.TV;

import java.util.Scanner;

public class UsaTv {
    public static void main(String[] args) {
        TV tv = new TV();

        Scanner s = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 7) {
            System.out.println("\n0 - Desligar a TV");
            System.out.println("1 - Ligar a TV");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Aumentar canal");
            System.out.println("5 - Diminuir canal");
            System.out.println("6 - Mostrar infos");
            System.out.println("7 - Sair.");
            opcao = s.nextInt();

            if (opcao == 0) {
                tv.statusDesligada();
            } else if (opcao == 1) {
                tv.statusLigada();
            } else if (opcao == 2) {
                tv.aumentarVolume();
            } else if (opcao == 3) {
                tv.diminuirVolume();
            } else if (opcao == 4) {
                tv.aumentarCanal();
            } else if (opcao == 5) {
                tv.diminuirCanal();
            } else if (opcao == 6) {
                tv.mostrarInfos();
            } else if (opcao == 7) {
            } else {
                System.out.println("Digito inválido");
            }
        }
        s.close();
    }
}