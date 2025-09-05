package TAD.Cubo;

public class ProgramaCubo {
    public static void main(String[] args) {
        CalculoCubo cb = new CalculoCubo();

        int area = cb.calcularArea(3);
        int volume = cb.calcularVolume(4);
        int lado = cb.calcularLado(3);

        System.out.printf("Lado: %d \nArea: %d\nVolume: %d",lado, area, volume);
    }
}