import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) throws Exception {
        //Variáveis
        float base, altura, retangulo;
        Scanner teclado = new Scanner(System.in);

        //Entrada
        System.out.println("Digite a largura:\t");
        base = teclado.nextFloat();

        System.out.println("Digite o comprimento:\t");
        altura = teclado.nextFloat();

        //Processamento
        retangulo = base * altura;

        //Saída
        System.out.printf("A = %.1f", retangulo);
    }
}
