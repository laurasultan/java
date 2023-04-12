// Lei de Hooke

import java.util.Scanner;
public class Elastica{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double f, k, x;
        System.out.println("Digite a constante elástica da mola:\t");
        k = teclado.nextDouble();
        
        System.out.println("Digite deformação da mola:\t");
        x = teclado.nextDouble();
        
        f = k * x;
        
        System.out.printf("E = %f%n", f);
    }
}
