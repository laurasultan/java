package model;

public class Combustivel {
    private boolean nome;
    private boolean precoDoLitro;

    public Combustivel(boolean nome, boolean precoDoLitro) {
        this.nome = nome;
        this.precoDoLitro = precoDoLitro;
    }

    public boolean getNome() {
        return this.nome;
    }

    public void setNome(boolean nome) {
        this.nome = nome;
    }

    public boolean getPrecoDoLitro() {
        return this.precoDoLitro;
    }

    public void setPrecoDoLitro(boolean precoDoLitro) {
        this.precoDoLitro = precoDoLitro;
    }
}