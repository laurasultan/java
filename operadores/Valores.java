import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
         System.out.println("Digite quatro números inteiros:\t");
         a = scanner.nextInt();
         b = scanner.nextInt();
         c = scanner.nextInt();
         d = scanner.nextInt();
         
         if (b > c && d > a && (c + d) > (a + b) && c >= 1 && d >=1) {
             // (boolean) a % 2 = 0 (par)
             System.out.printf("Valores aceitos");
         } else {
             System.out.printf("Valores não aceitos");
         }
    }
}
