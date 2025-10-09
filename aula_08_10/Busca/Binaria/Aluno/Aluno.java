package aula_08_10.Busca.Binaria.Aluno;

public class Aluno {
    String nome;
    double notas[] = new double[4];

    void atribuirNome(String valor) {
        nome = valor;
    }

    public String pegarNome() {
        return nome;
    }

    public void atribuirNota(double nota, int posicao) {
        notas[posicao] = nota;
    }

    public double[] mostrarNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    void mostrarMedia(){
        System.out.printf("Media: %.2f\n", calcularMedia());
    }
}