import java.util.Scanner;
public class Score {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, score;
        System.out.println("First score:\t");
        a = scanner.nextDouble();
        System.out.println("Second score:\t");
        b = scanner.nextDouble();
        System.out.println("Third score:\t");
        c = scanner.nextDouble();
        score = (a + b + c) / 3;
        System.out.printf("Final score = %.2f\t", score);
        
        if (score >= 6) {
            System.out.printf("Congratulations.");
        } else {
            System.out.printf("Exam failed.");
        }
    }
}
