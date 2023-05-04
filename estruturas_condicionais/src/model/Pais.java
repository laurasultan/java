package model;

public class Pais {
    private String nome;
    private int populacao;
    private int numeroDeCriancasNascidas;

    public Pais(String nome, int populacao, int numeroDeCriancasNascidas) {
        this.nome = nome;
        this.populacao = populacao;
        this.numeroDeCriancasNascidas = numeroDeCriancasNascidas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getNumeroDeCriancasNascidas() {
        return this.numeroDeCriancasNascidas
    }

    public void setNumeroDeCriancasNascidas(int numeroDeCriancasNascidas) {
        this.numeroDeCriancasNascidas = numeroDeCriancasNascidas;
    }

    public float calcularTaxaDeNatalidade(float natalidade) {
        natalidade = (numeroDeCriancasNascidas * 1000) / populacao;
        return natalidade; 
    }

    public float calcularTaxaDeMortalidade(float mortalidade, int numeroDeObitos) {
        mortalidade = (numeroDeObitos * 1000) / populacao;
        return mortalidade;
    }
}