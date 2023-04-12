import java.util.Scanner;
public class Peso{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double p, m, g;
        System.out.println("Digite a massa");
        m = teclado.nextFloat();
        
        g = 9.8;
        
        p = m * g;
        
        // System.out.printf("P = %", p);
        System.out.printf("P = %f%n", p);
    }
}
