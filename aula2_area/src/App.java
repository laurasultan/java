import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Variáveis
        float raio, area;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o raio:\t");
        raio = teclado.nextFloat();

        // Processamento
        area = (float) Math.PI * raio * raio;

        // Saída
        System.out.printf("A = %.4f", area);
    }
}
