import java.util.Scanner;
public class Exe10 {
    public static void main(String[] args) throws Exception {
        float x, y;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor de x:\t");
        x = teclado.nextFloat();

        // Processamento
        y = (x * 2) + (3 * x) - 4;

        // Saída
        System.out.printf("y = %.2f", y);
    }
}
