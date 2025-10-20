public class BuscaBinariaNicholas {

    static int buscaBinaria(int v[], int elem) {
        int inicio = 0, meio, fim = v.length - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (elem < v[meio]) {
                fim = meio - 1;
            } else if (elem > v[meio]) {
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1; // elemento não encontrado
    }

}