package model;

public abstract class Pessoa {
    protected byte codigo;
    protected String nome;
    protected String cpf;

    // Construtor
    protected Pessoa(byte codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos acessores
    // Getters
    public byte getCodigo() {
        return this.codigo;              // codigo
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Setters
    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}