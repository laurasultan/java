// Movimento retilíneo uniforme (MRU)

import java.util.Scanner;
public class Mru{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double sf, si, v, Δt;
        System.out.println("Digite a posição inicial:\t");  // 0
        si = teclado.nextDouble();
        
        System.out.println("Digite a velocidade média:\t");
        v = teclado.nextDouble();
        
        System.out.println("Digite o intervalo de tempo:\t");
        Δt = teclado.nextDouble();

        sf = si + v * Δt;

        System.out.printf("Sf = %f%n", sf);
    }
}
