package model;

public class Item {
    private Produto produto;
    private byte quantidade;

    public Item(Produto produto, byte quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public byte getQuantidade() {
        return quantidade;
    }
}