import java.util.Scanner;
public class Exe7 {
    public static void main(String[] args) throws Exception {
        float celsius, fahrenheit;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite a temperatura em graus Celsius:\t");
        celsius = teclado.nextFloat();

        // Processamento
        fahrenheit = (celsius * 9 / 5) + 32;

        // Saída
        System.out.printf("F = %.2f", fahrenheit);
    }
}
