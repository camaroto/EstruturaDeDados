public class IlistaNumeroIntero {
    public void inserirNoFinal(int valor);

    public void inserirNoIncio(int valor);

    public void inserirNomeio(int valor);

    public void inserirEmQualquerPosicao(int indice, int valor);

    public void removerDofinal();

    public void removerDoInicio();

    public void removerDoMeio();

    public void remover(int indice);

    public boolean estaCheia();

    public boolean estaVazia();

    public int buscaPorValor(int valor /* Retornar onde o Valor se Encontra */);

    public int buscaPorIndice(int valor /* Retornar onde o Indice se Encontra */);

    public int tamanho();
}