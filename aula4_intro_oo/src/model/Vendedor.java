package model;

public class Vendedor extends Pessoa {
    private float salario;

    public Vendedor(byte codigo, String nome, String cpf) {
        super(codigo, nome, cpf);
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
