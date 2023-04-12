// Velocidade média

import java.util.Scanner;
public class Velocidade{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double vm, Δs, Δt;
        System.out.println("Digite o intervalo do deslocamento:\t");
        Δs = teclado.nextDouble();
        
        System.out.println("Digite o intervalo de tempo:\t");
        Δt = teclado.nextDouble();

        vm = Δs / Δt;

        System.out.printf("Vm = %f%n", vm);
    }
}
