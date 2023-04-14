import java.util.Scanner;
public class Exe12 {
    public static void main(String[] args) throws Exception {
        float x, y;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor de x:\t");
        x = teclado.nextFloat();

        // Processamento
        y = (x * x * x) - (2 * x) + (3 * x);

        // Saída
        System.out.printf("y = %.2f", y);
    }
}
