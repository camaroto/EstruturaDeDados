import java.util.Scanner;

public class Contador {
    Scanner s = new Scanner(System.in);

    int valorAtual = 0;

    public void incrementar() {
        System.out.println("Digite o valor que deseja incrementar: ");
        int x = s.nextInt();
        valorAtual += x;
    }

    public void decrementar() {
        System.out.println("Digite o valor que deseja decrementar: ");
        int y = s.nextInt();
        valorAtual -= y;
    }

    public void obterValorAtual() {
        System.out.printf("O valor atual é %d", valorAtual);
    }
}