package aula_04_09.TAD.TV;

import java.util.Scanner;

public class UsaTv {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 7) {
            System.out.println("0 - Desligar a TV");
            System.out.println("1 - Ligar a TV");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Aumentar canal");
            System.out.println("5 - Diminuir canal");
            System.out.println("6 - Mostrar infos");
            System.out.println("7 - Sair.");
            opcao = s.nextInt();

        }
        s.close();
    }
}