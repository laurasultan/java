import java.util.Scanner;
public class Peso{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double p, m, g;
        System.out.println("Digite a massa:\t");
        m = teclado.nextDouble();
        
        g = 9.8;
        
        p = m * g;
        
        System.out.printf("P = %f%n", p);
    }
}
