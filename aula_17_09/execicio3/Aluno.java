package aula_17_09.execicio3;

public class Aluno {
    private String nome;
    private double[] notas = new double[4];

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Atribuir nota
    public void atribuirNota(int bimestre, double nota) {
        if (bimestre >= 1 && bimestre <= 4) {
            notas[bimestre - 1] = nota;
        }
    }

    // Mostrar notas
    public void mostrarNotas() {
        System.out.print(nome + " - Notas: ");
        for (double n : notas) {
            System.out.printf("%.1f ", n);
        }
        System.out.println();
    }

    // Calcular média
    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.length;
    }

    // Mostrar média
    public void mostrarMedia() {
        System.out.printf("%s - Média: %.1f\n", nome, calcularMedia());
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }
}
