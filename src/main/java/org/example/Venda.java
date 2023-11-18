package org.example;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private String cliente;
    private List<itemVenda> items;
    private double valorVenda;
    private double valorDesconto;

    public Venda(String cliente,double valorVenda,double valorDesconto) {
        this.cliente = cliente;
        this.valorVenda = valorVenda;
        this.valorDesconto = valorDesconto;
        this.items = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<itemVenda> getItems() {
        return items;
    }

    public void adicionarItem(String descricao, double valorUnitario, int quantidade) {
        itemVenda item = new itemVenda(descricao, valorUnitario, quantidade);
        this.items.add(item);
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
