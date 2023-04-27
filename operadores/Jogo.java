import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v, j1, j2;
        // System.out.println("Escolha par ou ímpar:\t");
        System.out.println("Escolha entre par (0) ou ímpar (1):\t");
        v = scanner.nextInt();
        System.out.println("Digite um número (jogador 1):\t");
        j1 = scanner.nextInt();
        System.out.println("Digite um número (jogador 2):\t");
        j2 = scanner.nextInt();
        
        if (v == 0 && (j1 + j2) % 2 == 0) {
            System.out.println("Jogador 1 venceu");
        } else if (v == 1 && (j1 + j2) % 2 != 0) {
            System.out.println("Jogador 1 venceu");
        } else {
            System.out.println("Jogador 2 venceu");
        }
    }
}
