package aula_08_10.Busca.Binaria;

public class Exemplo2 {
    static int buscaBinaria(int v[], int elem) {

        int inicio = 0, meio, fim = v.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elem < v[meio]) {
                fim = meio - 1; // buscar pela metade à esquerda
            } else if (elem > v[meio]) {
                inicio = meio + 1; // buscar pela metade à direita
            } else {
                return meio;
            }
        }

        return -1; // elemento não encontrado
    }

    public static void main(String[] args) {

        int numeros[] = { -8, -5, 1, 4, 21, 23, 54, 68, 90 };
        int valorASerEncontrado = 4;
        int indice = buscaBinaria(numeros, valorASerEncontrado);

        if (indice > -1) {
            System.out.printf("valor encontrado no indice %d", indice);
        } else {
            System.out.println("Valor não encontrado!");
        }
    }
}
