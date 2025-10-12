package guanabara;
import java.awt.Toolkit;
import java.awt.Dimension;


public class resolucao {
    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = (int)size.getWidth();
        int altura = (int)size.getHeight();

        System.out.printf("a resolução é de %d x %d", largura, altura);
    }
}
