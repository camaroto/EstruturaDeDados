package ExemplosGuria.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        // construtor padrao
        Produto p1 = new Produto();
        p1.nome = "Caneta preta";
        p1.marca = "bic";
        p1.valor = 1.49f;

        // construtor de dois parametros
        Produto p2 = new Produto("Caneta Azul", "Bic");
        p2.valor = 1.35f;

        // construtor de tres parametros
        Produto p3 = new Produto("borracha", "faber", 1.90f);

        // objeto p1
        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);
        // objeto p2
        System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " Valor: " + p2.valor);
        // objeto p3
        System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " Valor: " + p3.valor);
    }
}
