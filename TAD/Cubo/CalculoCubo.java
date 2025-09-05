package TAD.Cubo;

public class CalculoCubo {
    Cubo cubo = new Cubo();

    int calcularArea(int lado) {
        int resultadoArea = lado * lado;

        return resultadoArea;
    }

    int calcularVolume(int lado) {
        int resultadoVolume = lado * lado * lado;

        return resultadoVolume;
    }

    int calcularLado(int lado) {
        int ld = lado;
        return ld;
    }
}