public class ListaInteiro implements IlistaNumeroIntero {
    /* Definir o Tamanho do vetor */
    private final int TAMANHO_MAXIMO = 100;
    /* Identifida a quantidade de elementos existentes nas Lista */
    private int tamanho;
    /* Guardar os Numeros Informados pelo Usuário */
    private int[] dados;

    /* Criar Lista */
    public ListaInteiro() {
        tamanho = 0;
        dados = new int[TAMANHO_MAXIMO];
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaCheia() {
        return tamanho == TAMANHO_MAXIMO;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void inserirNoIncio(int valor) {
        inserirEmQualquerPosicao(0, valor);
    }

    public void inserirNoFinal(int valor) {
        if (!estaCheia()) {
            dados[tamanho] = valor;
            tamanho++;
        } else {
            System.err.println("A Lista está cheia");
        }
    }

    public void inserirNomeio(int valor) {
        int meio = tamanho / 2;
        inserirEmQualquerPosicao(meio, valor);
    }

    public void inserirEmQualquerPosicao(int indice, int valor) {

        if (indice > tamanho || indice < 0) {
            System.err.println("Indice Inválido!");
        } else if (estaCheia()) {
            System.err.println("A Lista eatá cheia");
        } else if (indice == tamanho) {
            inserirNoFinal(valor);
        } else if (indice < tamanho) {
            for (int i = tamanho; i > indice; i--) {
                dados[i] = dados[i - 1];
            }
            dados[indice] = valor;
            tamanho++;
        }
    }

    public void removerDofinal() {
        if (estaVazia()) {
            System.err.println("A Lista está vazia");
        } else {
            tamanho--;
        }
    }

    public void removerDoInicio() {
        if (estaVazia()) {
            System.err.println("A Lista está vazia");
        } else {
            for (int i = 0; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanho--;

        }
    }

    public void removerDoMeio() {
        if (estaVazia()) {
            System.err.println("A Lista está vazia");
        } else {
            int meio = tamanho / 2;
            for (int i = meio; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            tamanho--;
        }

    }
}