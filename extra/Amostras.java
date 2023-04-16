// Cálculo do tamanho da amostra
// Populações INFINITAS

import java.util.Scanner;
public class Infinitas {
    public static void main(String[] args) throws Exception {
        float n, σ, p, q, e;
        Scanner scanner = new Scanner(System.in);
        
        // Se o número se situa por volta de 10% então p = 10
        System.out.println("Digite a percentagem com a qual o fenômeno se identifica (p):\t");
        p = scanner.nextFloat();
        
        // Consequentemente q = 100 - 10 = 90
        System.out.println("Digite a percentagem complementar (q = 100 - p):\t");
        q = scanner.nextFloat();
        
        // Se for desejado um nível de confiança bastante alto (superior a 99%),
        // aplica-se à fórmula 3 desvios; logo σ2 = 3 * 3 = 9
        System.out.println("Digite o nível de confiança escolhido (σ), n° de desvios-padrão:\t");
        σ = scanner.nextFloat();
        
        // Se o erro máximo permitido for de 2%, então e2 = 2 * 2 = 4
        System.out.println("Digite o erro máximo permitido (e):\t");
        e = scanner.nextFloat();
        
        n = (σ * σ * p * q) / (e * e);
        System.out.printf("Tamanho da amostra = %.2f", n);
    }
}
