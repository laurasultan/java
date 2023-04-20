import java.util.Scanner;

public class QuadraticFormula {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the values of a, b, and c in ax^2 + bx + c = 0:");

      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      double discriminant = b * b - 4 * a * c;

      if (discriminant < 0) {
         System.out.println("The quadratic equation has no real roots.");
      } else if (discriminant == 0) {
         double root = -b / (2 * a);
         System.out.println("The quadratic equation has one root: " + root);
      } else {
         double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
         double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
         System.out.println("The quadratic equation has two roots: " + root1 + " and " + root2);
      }
   }
}
