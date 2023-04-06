import java.util.Scanner;
public class Exe9 {
    public static void main(String[] args) throws Exception {
        float a, b, c, d, media;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor de a:\t");
        a = teclado.nextFloat();

        System.out.println("Digite o valor de b:\t");
        b = teclado.nextFloat();

        System.out.println("Digite o valor de c:\t");
        c = teclado.nextFloat();

        System.out.println("Digite o valor de d:\t");
        d = teclado.nextFloat();

        // Processamento
        media = (a + b + c + d) / 4;

        // Saída
        System.out.printf("Média = %.2f", media);
    }
}
