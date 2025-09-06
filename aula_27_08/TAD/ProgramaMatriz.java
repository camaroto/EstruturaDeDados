package aula_27_08.TAD;

public class ProgramaMatriz {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();

        m1.definirValor(4, 4, 50);
        m1.definirValor(0, 0, -50);
        m1.definirValor(9, 9, 25);

        System.out.printf("Valor do meio: %d\n", m1.obterValor(4, 4));

        int maior = m1.maior();

        System.out.printf("O maior valor é: %d\n", maior);
    }
}