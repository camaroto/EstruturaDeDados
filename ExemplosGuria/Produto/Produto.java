package ExemplosGuria.Produto;

public class Produto {
    
    //atributos
    String nome;
    String marca;
    float valor;

    //construtores
    Produto(){
        
    }

    Produto(String modelo){
        nome = modelo;
    }

    Produto(String modelo, String marca){
        nome = modelo;
        this.marca = marca;
    }

    Produto(String modelo, String marca, float valor){
        nome = modelo;
        this.marca = marca;
        this.valor = valor;
    }
}
