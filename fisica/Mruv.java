// Movimento retilíneo uniformemente variado (MRUV)

// Aceleração média: a = Δv / Δt

import java.util.Scanner;
public class Mruv{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double v, vo, a, t;
        System.out.println("Digite a velocidade inicial:\t");  // 0
        vo = teclado.nextDouble();
        
        System.out.println("Digite a aceleração:\t");
        a = teclado.nextDouble();
        
        System.out.println("Digite o tempo:\t");
        t = teclado.nextDouble();

        v = vo + a * t;

        System.out.printf("V = %f%n", v);
    }
}
