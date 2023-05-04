package model;

public class Abastecimento {
    private String nomeDoCliente;
    private Combustivel combustivel;
    private int quantidadeDeLitros;

    public Abastecimento(String nomeDoCliente, Combustivel combustivel, int quantidadeDeLitros) {
        this.nomeDoCliente = nomeDoCliente;
        this.combustivel = combustivel;
        this.quantidadeDeLitros = quantidadeDeLitros;        
    }

    public String getNomeDoCliente() {
        return this.nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public Combustivel getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuantidadeDeLitros() {
        return this.quantidadeDeLitros;
    }

    public void setQuantidadeDeLitros(int quantidadeDeLitros) {
        this.quantidadeDeLitros = quantidadeDeLitros;
    }

    public float calcularTotalAPagar() {
        if (quantidadeDeLitros <= 20) {
            total = ()
        }
    }
}

// desconto = 3;
// s = 100 - desconto;
// total = (s * preco) / 100;