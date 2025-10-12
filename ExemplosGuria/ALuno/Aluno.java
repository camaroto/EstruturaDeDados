package ExemplosGuria.ALuno;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida");
        }
    }
}
