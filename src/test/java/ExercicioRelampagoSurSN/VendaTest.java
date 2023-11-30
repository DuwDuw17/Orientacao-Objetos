package ExercicioRelampagoSurSN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveRetornarVenderEstoqueInsuficiente(){
        Cliente cliente = new Cliente("Eu", "123.456.789-12");
        Produto produto = new Produto("Camisa", 30, 80, 20, 100);
        Venda venda = new Venda("29/11/2023", cliente, produto, 40);
        assertFalse(venda.vender(produto, 31));
    }

    @Test
    void deveRetornarVenderEstoqueBaixo(){
        Cliente cliente = new Cliente("Eu", "123.456.789-12");
        Produto produto = new Produto("Camisa", 30, 80, 20, 100);
        Venda venda = new Venda("29/11/2023", cliente, produto, 40);
        assertFalse(venda.vender(produto, 40));
    }

    @Test
    void deveRetornarVender(){
        Cliente cliente = new Cliente("Eu", "123.456.789-12");
        Produto produto = new Produto("Camisa", 30, 80, 20, 100);
        produto.vender("23/12/2023", cliente, 10);
        assertTrue(produto.getHistorico().contains("Venda realizada: " + 10 + " unidades"));
    }
}