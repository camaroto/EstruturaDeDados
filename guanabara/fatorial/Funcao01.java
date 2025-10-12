package guanabara.fatorial;

import java.util.Scanner;

public class Funcao01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Fatorial f = new Fatorial();
        f.setValor(s.nextInt());
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
