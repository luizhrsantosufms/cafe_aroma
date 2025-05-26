package com.example.cafe_aroma;

public class ItemCarrinho {
    private String nome;
    private double preco;

    public ItemCarrinho(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
