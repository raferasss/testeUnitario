package org.example;

public class itemVenda {

    private String descricao;
    private double valorUnitario;
    private int quantidade;

    public itemVenda(String descricao,double valorUnitario,int quantidade) {
        if(descricao.length() >= 20) {
            System.out.println("Limite maximo de caracteres = 20");
            return;
        }
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
