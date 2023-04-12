import java.util.Scanner;
public class Impulso{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double i, f, Δt;
        System.out.println("Digite a força:\t");
        f = teclado.nextDouble();
        
        System.out.println("Digite o intervalo de tempo:\t");
        Δt = teclado.nextDouble();
        
        i = f * Δt;
        
        System.out.printf("I = %f%n", i);
    }
}
