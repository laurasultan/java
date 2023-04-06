import java.util.Scanner;
public class Exe11 {
    public static void main(String[] args) throws Exception {
        float salario, resultado;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor do salário base:\t");
        salario = teclado.nextFloat();

        // Processamento
        resultado = salario - salario * 0.3f;

        // Saída
        System.out.printf("R = %.2f", resultado);
    }
}
