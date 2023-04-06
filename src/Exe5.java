import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) throws Exception {
        float a, b, modulo;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor de a:\t");
        a = teclado.nextFloat();

        System.out.println("Digite o valor de b:\t");
        b = teclado.nextFloat();

        // Processamento
        modulo = a % b;

        // Saída
        System.out.printf("Módulo = %.2f", modulo);
    }
}
