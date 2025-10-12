package guanabara;

import java.util.Scanner;

public class metodo2 {

    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura = s.nextInt();
        int largura = s.nextInt();
        int sm = soma(altura, largura);
        System.out.println(sm);
    }
}
