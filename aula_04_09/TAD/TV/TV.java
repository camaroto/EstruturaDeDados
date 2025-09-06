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
        if (this.volume < 100) {
            this.volume += 1;
        } else {
            System.out.println("Você já está no volume máximo.");
        }
        return volume;
    }

    public int diminuirVolume() {
        if (this.volume > 0) {
            this.volume -= 1;
        } else {
            System.out.println("Você já está no volume mínimo.");
        }
        return volume;
    }

    public int aumentarCanal() {
        if (this.canal < 999) {
            this.canal += 1;
        } else {
            this.canal = 0;
            System.out.println("Canal voltou para 0");
        }
        return canal;
    }

    public int diminuirCanal() {
        if (this.canal > 0) {
            this.canal -= 1;
        } else {
            this.canal = 999;
            System.out.println("Canal voltou para 999.");
        }
        return canal;
    }

    public void mostrarInfos() {
        System.out.printf("\nA tv está: %s\n", status ? "ligada" : "desligada");
        System.out.printf("Volume: %d\n", volume);
        System.out.printf("Canal: %d\n", canal);
    }
}