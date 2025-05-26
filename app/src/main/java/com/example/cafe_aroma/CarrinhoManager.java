package com.example.cafe_aroma;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoManager {

    private static CarrinhoManager instancia;
    private List<ItemCarrinho> itens = new ArrayList<>();

    private CarrinhoManager() {}

    public static CarrinhoManager getInstancia() {
        if (instancia == null) {
            instancia = new CarrinhoManager();
        }
        return instancia;
    }

    public void adicionarItem(ItemCarrinho item) {
        itens.add(item);
    }

    public List<ItemCarrinho> getItens() {
        return new ArrayList<>(itens);
    }

    public void limparCarrinho() {
        itens.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
