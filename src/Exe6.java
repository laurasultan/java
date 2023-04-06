import java.util.Scanner;
public class Exe6 {
    public static void main(String[] args) throws Exception {
        float base, potencia, resultado;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor da base:\t");
        base = teclado.nextFloat();

        System.out.println("Digite o valor da potência:\t");
        potencia = teclado.nextFloat();

        // Processamento
        resultado = (float) Math.pow(base, potencia);

        // Saída
        System.out.printf("R = %.2f", resultado);
    }
}
