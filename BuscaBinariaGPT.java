public class BuscaBinariaGPT {

    static int buscaBinaria(Aluno v[], int total, double elem) {
        int ini = 0, fim = total - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio].nota == elem)
                return meio;
            if (elem < v[meio].nota)
                fim = meio - 1;
            else
                ini = meio + 1;
        }
        return -1;
    }
}