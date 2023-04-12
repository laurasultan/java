// NEE = Mulheres, 19 anos ou mais
// AF = Coeficientes de atividade física
// Sedentária = 1
// Pouco ativa = 1.12
// Ativa = 1.27
// Muito ativa = 1.45

import java.util.Scanner;
public class Nee{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double nee, idade, af, peso, altura;
        System.out.println("Digite a idade:\t");
        idade = teclado.nextDouble();
        
        System.out.println("Digite o AF:\t");
        af = teclado.nextDouble();
        
        System.out.println("Digite o peso:\t");
        peso = teclado.nextDouble();
        
        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        nee = 354 - (6.91 * idade) + af * ((9.36 * peso) + (726 * altura));

        System.out.printf("NEE = %f%n", nee);
    }
}

// NEE = Homens, 19 anos ou mais
// AF = Coeficientes de atividade física
// Sedentário = 1
// Pouco ativo = 1.11
// Ativo = 1.25
// Muito ativo = 1.48

import java.util.Scanner;
public class Nee{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double nee, idade, af, peso, altura;
        System.out.println("Digite a idade:\t");
        idade = teclado.nextDouble();
        
        System.out.println("Digite o AF:\t");
        af = teclado.nextDouble();
        
        System.out.println("Digite o peso:\t");
        peso = teclado.nextDouble();
        
        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        nee = 662 - (9.53 * idade) + af * ((15.91 * peso) + (539.6 * altura));

        System.out.printf("NEE = %f%n", nee);
    }
}
