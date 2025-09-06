package aula_27_08.TAD;

public class Matriz {
    int numeros[][] = new int[10][10];

    void definirValor(int linha, int coluna, int valor) {
        numeros[linha][coluna] = valor;
    }

    int obterValor(int linha, int coluna) {
        return numeros[linha][coluna];
    }

    int maior() {
        int auxiliar = numeros[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros[i][j] > auxiliar) {
                    auxiliar = numeros[i][j];
                }
            }
        }
        return auxiliar;
    }
}
