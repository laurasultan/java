import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("Lado A:\t");
        ladoA = scanner.nextInt();

        System.out.println("Lado B:\t");
        ladoB = scanner.nextInt();

        System.out.println("Lado C:\t");
        ladoC = scanner.nextInt();

        if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
            System.out.printf("Triângulo Equilátero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.printf("Triângulo Isósceles");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.printf("Triângulo Escaleno");
        } else {
            System.out.printf("Não é um triângulo.");
        }
    }
}
