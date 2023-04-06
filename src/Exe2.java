import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) throws Exception {
        float raio, perimetro;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o raio:\t");
        raio = teclado.nextFloat();

        // Processamento
        perimetro = (float) Math.PI * 2 * raio;

        // Saída
        System.out.printf("P = %.4f", perimetro);
    }
}
