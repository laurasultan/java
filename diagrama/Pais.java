public class Pais {
    private String codigoISO;
    private String nome;
    private String capital;
    private String linguaOficial;
    private int populacao;
    private int dimensao;

    public Pais(String codigoISO, String nome, String capital, String linguaOficial, int populacao, int dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.capital = capital;
        this.linguaOficial = linguaOficial;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public Pais(String codigoISO, String nome, int populacao, int dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public float calcularDensidadeDemografica() {
        float densidadeDemografica = populacao / dimensao;
        return densidadeDemografica;
    }

    public String toString() {
        return "Código ISO: " + codigoISO + "; Nome: " + nome + "; Capital: " + capital + "; Língua oficial: " + linguaOficial + "; População: " + populacao + "; Dimensão: " + dimensao;
    }
}
