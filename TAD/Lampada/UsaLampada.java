package TAD.Lampada;
import java.util.Scanner;

public class UsaLampada {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        Scanner s = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 3) {
            System.out.println("\n0 - Desligar a lampada");
            System.out.println("1 - Ligar a lampada");
            System.out.println("2 - Mostrar status da lampada");
            System.out.println("3 - Sair.");
            opcao = s.nextInt();

            if (opcao == 1) {
                lp.statusLigada();
            } else if (opcao == 0) {
                lp.statusDesligada();
            } else if (opcao == 2) {
                lp.mostrarStatus();
            } else if (opcao == 3) {
            } else {
                System.out.println("Opção inválida");
                main(args);
            }
        }
        s.close();
    }
}