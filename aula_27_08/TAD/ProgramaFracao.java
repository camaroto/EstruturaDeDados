package aula_27_08.TAD;

import java.util.Scanner;

public class ProgramaFracao {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Criação do objeto da classe Fracao
        Fracao f1 = new Fracao();

        System.out.println("Digite o numerador: ");
        f1.numerador = s.nextInt();

        System.out.println("Digite o dividor: ");
        f1.divisor = s.nextInt();

        int resultado = f1.obterResultado();

        System.out.printf("Resultado: %d\n", resultado);

        s.close();
    }
}