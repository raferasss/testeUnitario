package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class itemVendaTest {

    @Test
    public void testConstrutorComDescricaoMaiorQue20Caracteres() {
        String descricaoLonga = "Descrição com mais de 20 caracteres";
        double valorUnitario = 10.0;
        int quantidade = 2;
        new itemVenda(descricaoLonga, valorUnitario, quantidade);
        fail("Deveria ter lançado uma exceção IllegalArgumentException");

    }
}