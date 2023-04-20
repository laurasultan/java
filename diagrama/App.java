public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario((short) 123, "Laura", 10.0f);
        System.out.println(funcionario.calcularSalarioLiquido((short) 160));
        
        Data data = new Data((byte )22, "janeiro", (short)1990, "quarta");
        System.out.println(data.toString());

        Reta reta = new Reta((byte) 1, (byte) 2, (byte) 3, (byte) 4);
        System.out.println(reta.calcularCoeficienteAngular());

        Pais pais = new Pais("BR", "Brasil", "Brasília", "Português", 210147125, 8515767);
        System.out.println(pais.calcularDensidadeDemografica());

        Filme filme = new Filme("The Godfather", "Drama", (short) 175, (short) 1972);
        System.out.println(filme.calcularDuracaoEmHoras());
    }
}
