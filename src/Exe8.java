import java.util.Scanner;
public class Exe8 {
    public static void main(String[] args) throws Exception {
        float produto, desconto, valor;
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o valor do produto:\t");
        produto = teclado.nextFloat();

        System.out.println("Digite o valor do desconto:\t");
        desconto = teclado.nextFloat();

        // Processamento
        valor = produto - (produto * desconto / 100);

        // Saída
        System.out.printf("Valor = %.2f", valor);
    }
}
