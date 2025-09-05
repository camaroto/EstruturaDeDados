package aula_04_09.TAD.TV;

public class TV {
    boolean status;
    int volume = 0;
    int canal = 0;

    public void statusLigada() {
        this.status = true;
    }

    public void statusDesligada() {
        this.status = false;
    }

    public int aumentarVolume() {
        this.volume += 1;
        return volume;
    }

    public int diminuirVolume() {
        this.volume -= 1;
        return volume;
    }

    public int aumentarCanal() {
        this.canal += 1;
        return canal;
    }

    public int diminuirCanal() {
        this.canal -= 1;
        return canal;
    }

}