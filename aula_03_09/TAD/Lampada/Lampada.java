package aula_03_09.TAD.Lampada;
public class Lampada {

    boolean status;
    int statusLP1;

    public void statusLigada() {
        this.status = true;
        System.out.println("A lâmpada foi ligada");
    }

    public void statusDesligada() {
        this.status = false;
        System.out.println("A lâmpada foi desligada");
    }

    public void mostrarStatus() {
        System.out.printf("A lampada 1 está: %s\n", status ? "Ligada" : "Desligada");
        System.out.printf("A lampada 2 está: %s\n", !status ? "Ligada" : "Desligada");
    }
}