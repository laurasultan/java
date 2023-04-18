package model;

public class Cliente extends Pessoa {
    private short pontosDeFidelidade;

    public Cliente(byte codigo, String nome, String cpf) {
        super(codigo, nome,cpf);
        this.pontosDeFidelidade = 20;
    }

    public short getPontosDeFidelidade() {
        return this.pontosDeFidelidade;
    }

    public void setPontosDeFidelidade(short pontosDeFidelidade) {
        this.pontosDeFidelidade = pontosDeFidelidade;
    }
}