import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) throws Exception {
        float a, b, c, resultado;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor de a:\t");
        a = teclado.nextFloat();

        System.out.println("Digite o valor de b:\t");
        b = teclado.nextFloat();

        System.out.println("Digite o valor de c:\t");
        c = teclado.nextFloat();

        // Processamento
        resultado = (a + b) * c;

        // Saída
        System.out.printf("R = %.2f", resultado);
    }
}
