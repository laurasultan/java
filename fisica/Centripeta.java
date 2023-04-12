import java.util.Scanner;
public class Centripeta{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double f, m, v, r;
        System.out.println("Digite a massa:\t");
        m = teclado.nextDouble();
        
        System.out.println("Digite a velocidade:\t");
        v = teclado.nextDouble();
        
        System.out.println("Digite o raio:\t");
        r = teclado.nextDouble();
        
        f = m * (v * v) / r;
        
        System.out.printf("F = %f%n", f);
    }
}
