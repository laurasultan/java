package model;

public class Cliente extends Pessoa {
    private short pontosDeFidelidade;

    public short getPontosDeFidelidade() {
        return this.pontosDeFidelidade;
    }

    public void setPontosDeFidelidade(short pontosDeFidelidade) {
        this.pontosDeFidelidade = pontosDeFidelidade;
    }
}