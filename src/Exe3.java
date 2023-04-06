import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) throws Exception {
        // Variáveis
        float peso, altura, imc;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o peso (em kg):\t");
        peso = teclado.nextFloat();

        System.out.println("Digite a altura (em m):\t");
        altura = teclado.nextFloat();

        // Processamento
        imc = peso / (altura * altura);

        // Saída
        System.out.printf("IMC = %.2f", imc);
    }
}
