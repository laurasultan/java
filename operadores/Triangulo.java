import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.println("Digite os valores de A, B e C:\t");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        
        // (a >= b + c) ? 
        
        if (a >= b + c) {
            System.out.printf("Não forma triângulo");
        } else if (a * a == b * b + c * c) {
            System.out.printf("Triângulo retângulo");
        } else if (a * a > b * b + c * c) {
            System.out.printf("Triângulo obstusângulo");
        } else if (a * a < b * b + c * c) {
            System.out.printf("Triângulo acutângulo");
        } else if (a == b && a == c && b == c) {
            System.out.printf("Triângulo equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.printf("Triângulo isósceles");
        }
    }
}
