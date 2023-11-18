package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VendaTest {

    @Test
    public void adicionarItem() {
        Venda venda = new Venda("Cliente1", 100.0, 10.0);
        venda.adicionarItem("Produto1", 10.0, 2);
        List<itemVenda> itensDaVenda = venda.getItems();
        assertFalse(itensDaVenda.isEmpty());
        itemVenda primeiroItem = itensDaVenda.get(0);
        assertNotNull(primeiroItem.getDescricao());
        assertEquals(10.0, primeiroItem.getValorUnitario(), 0.001);
        assertEquals(2.0, primeiroItem.getQuantidade(), 0.001);
    }

    @Test
    public void testConstrutorVendaIniciaArrayList() {
        Venda venda = new Venda("Cliente1", 100.0, 10.0);
        List<itemVenda> itensDaVenda = venda.getItems();
        assertNotNull(itensDaVenda);
        assertTrue(itensDaVenda.isEmpty());
    }
}