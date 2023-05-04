import java.util.Scanner;

public class Pais {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int populacao;
        int numeroDeCriancasNascidas;
        int numeroDeObitos;
        float calcularTaxaDeNatalidade;
        float calcularTaxaDeMortalidade;

        System.out.println("População:\t");
        populacao = scanner.nextInt();

        System.out.println("Número de crianças nascidas:\t");
        numeroDeCriancasNascidas = scanner.nextInt();

        System.out.println("Número de óbitos:\t");
        numeroDeObitos = scanner.nextInt();

        calcularTaxaDeNatalidade = (numeroDeCriancasNascidas * 1000) / populacao;

        calcularTaxaDeMortalidade = (numeroDeObitos * 1000) / populacao;

        System.out.printf("Taxa de natalidade: %.2f\n", calcularTaxaDeNatalidade);
        System.out.printf("Taxa de mortalidade: %.2f", calcularTaxaDeMortalidade);
    }
}
