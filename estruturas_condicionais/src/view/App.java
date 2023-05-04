public class App {
    public static void main(String[] args) throws Exception {

        Pais pais = new Pais("Brasil", 220000000, 7000);
        System.out.println(pais.calcularTaxaDeNatalidade());
        System.out.println(pais.calcularTaxaDeMortalidade());

        Triangulo triangulo = new Triangulo(3, 3, 3);
        System.out.println(triangulo.verificarTipoDeTriangulo());

        Crime crime = new Crime(a);
        System.out.println(crime.verificarNivelDeSuspeita());
    }
}
