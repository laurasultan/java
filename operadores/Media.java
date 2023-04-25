import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1, n2, n3, n4, media;
        System.out.println("Digite suas notas:\t");
         n1 = scanner.nextFloat();
         n2 = scanner.nextFloat();
         n3 = scanner.nextFloat();
         n4 = scanner.nextFloat();
         
         media = (n1 + n2 + n3 + n4) / 4;
         System.out.printf("Média: %.1f\t", media);
         
         if (media >= 7.0) {
             System.out.printf("Aluno aprovado");
         } else if (media < 5.0) {
             System.out.printf("Aluno reprovado");
         } else {
             System.out.printf("Aluno em exame");
         }
         
         // exame
    }
}
