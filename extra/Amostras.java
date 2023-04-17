// CÁLCULO DO TAMANHO DA AMOSTRA
// Populações INFINITAS (> 100 000 habitantes)

import java.util.Scanner;
public class Infinitas {
    public static void main(String[] args) throws Exception {
        float n, σ, p, q, e;
        Scanner scanner = new Scanner(System.in);
        
        // Se o número se situa por volta de 10% então p = 10
        System.out.println("Digite a percentagem com a qual o fenômeno se verifica (p):\t");
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

                        // // Se for desejado um nível de 95%,
                        // // aplica-se à fórmula 2 desvios; logo σ2 = 2 * 2 = 4
                        // System.out.println("Digite o nível de confiança escolhido (σ), n° de desvios-padrão:\t");
                        // σ = scanner.nextFloat();

                        // // Se o erro máximo permitido for de 3%, então e2 = 3 * 3 = 9
                        // System.out.println("Digite o erro máximo permitido (e):\t");
                        // e = scanner.nextFloat();

// A afirmativa da percentagem com a qual o fenômeno se veirifca foi estabelecida previamente.
// Quando isto não é possível, adota-se o valor máximo de p, que é 50.

----------------------------------------------------------------------------------------------------------------------------------------------
    
// CÁLCULO DO TAMANHO DA AMOSTRA
// Populações FINITAS (< 100 000 habitantes)
    
import java.util.Scanner;
public class Finitas {
    public static void main(String[] args) throws Exception {
        float n, σ, p, q, N, e;
        Scanner scanner = new Scanner(System.in);
        
        // Tamanho da população. Exemplo = 10000
        System.out.println("Digite o tamanho da população (N):\t");
        N = scanner.nextFloat();
        
        // Se o número se situa por volta de 30% então p = 30
        System.out.println("Digite a percentagem com a qual o fenômeno se verifica (p):\t");
        p = scanner.nextFloat();
        
        // Consequentemente q = 100 - 30 = 70
        System.out.println("Digite a percentagem complementar (q = 100 - p):\t");
        q = scanner.nextFloat();
        
        // Se for desejado um nível de 95%,
        // aplica-se à fórmula 2 desvios; logo σ2 = 2 * 2 = 4
        System.out.println("Digite o nível de confiança escolhido (σ), n° de desvios-padrão:\t");
        σ = scanner.nextFloat();
        
        // Se o erro máximo permitido for de 3%, então e2 = 3 * 3 = 9
        System.out.println("Digite o erro máximo permitido (e):\t");
        e = scanner.nextFloat();
        
        n = (σ * σ * p * q * N) / ((e * e) * (N - 1) + (σ * σ * p * q));
        System.out.printf("Tamanho da amostra = %.2f", n);
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------
   
// DETERMINAÇÃO DA MARGEM DE ERRO DA AMOSTRA
// Quando já se efetivou uma pesquisa e se deseja conhecer a margem de erro da amostra utilizada
    
import java.util.Scanner;
public class Margem {
    public static void main(String[] args) throws Exception {
        double σp, p, q, n, x, y, z;
        Scanner scanner = new Scanner(System.in);
        
        // Se o número se situa por volta de 30% então p = 30
        System.out.println("Digite a percentagem com a qual o fenômeno se verifica (p):\t");
        p = scanner.nextDouble();
        
        // Consequentemente q = 100 - 30 = 70
        System.out.println("Digite a percentagem complementar (q = 100 - p):\t");
        q = scanner.nextDouble();
        
        // Número de elementos incluídos na amostra. Exemplo = 1000
        System.out.println("Digite o n° de elementos incluídos na amostra (n):\t");
        n = scanner.nextDouble();
        
        σp = (p * q) / n;
        
        x = Math.sqrt(σp);
        
        System.out.printf("Erro padrão ou desvio = %.2f\n", x);
        
        y = p + x;
        z = p - x;
        
        System.out.printf("Margem máxima = %.2f\n", y);
        System.out.printf("Margem mínima = %.2f\n", z);
    }
}

                        // Se σ = 1.45 então:
                        // Para 1 desvio (1.45)
                        // Para dois desvios, o dobro (2.90)
                        // Para três desvios, o triplo (4.35)

// Para um nível de confiança de 95% (dois desvios), o resultado da pesquisa terá uma margem de erro 2.90 a mais ou a menos
// Provavelmente, o n° de elementos esteja entre 27.10% e 32.90% -------------------- devido a p = 30%
