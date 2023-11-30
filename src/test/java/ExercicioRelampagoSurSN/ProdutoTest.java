package ExercicioRelampagoSurSN;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarEStoqueInvalidoDebitar(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        try{
            produto.debitarEstoque(101);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Estoque inválido", e.getMessage());
        }
    }

    @Test
    void deveDebitarEstoque(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        produto.debitarEstoque(99);
        assertEquals(1, produto.getQtdeEstoque());
    }

    @Test
    void deveRetornarEstoqueInvalidoCreditar(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        try {
            produto.creditarEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Impossivel aumentar estoque", e.getMessage());
        }
    }

    @Test
    void deveCreditarEstoque(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        produto.creditarEstoque(1);
        assertEquals(101, produto.getQtdeEstoque());
    }

    @Test
    void deveVerificarEstoqueBaixo(){
        Produto produto = new Produto("Caneta", 19, 10, 20, 100);
        assertTrue(produto.verificarEstoqueBaixo());
    }

    @Test
    void deveVerificarEstoqueInsuficiente(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        assertTrue(produto.verificarEstoqueInsuficiente(101));
    }

    @Test
    void deveVerificarEstoqueExcedente(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 103);
        assertTrue(produto.verificarEstoqueExcedente(4));
    }

    @Test
    void deveCalcularValorVenda(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        assertEquals(100, produto.calcularValorVenda(10));
    }

    @Test
    void deveVender(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 100);
        Cliente cliente = new Cliente("Vasco", "12345678");
        produto.vender("10/11/2023", cliente, 10);
        assertEquals(1, produto.getHistorico().size());
    }

    @Test
    void deveComprar(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 200);
        Fornecedor fornecedor = new Fornecedor("Vasco", "12345678");
        produto.comprar("29/11/2023", fornecedor, 10, 10);
        assertEquals(1, produto.getHistorico().size());
    }

    @Test
    void deveRegistrarHistorico(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 200);
        produto.regsistrarHistorico("Compra");
        assertEquals(1, produto.getHistorico().size());
    }

    @Test
    void deveExibirHistorico(){
        Produto produto = new Produto("Caneta", 100, 10, 20, 200);
        produto.regsistrarHistorico("Compra");
        ArrayList<String> historico = new ArrayList<>();
        historico = produto.exibirHistorico();
        assertEquals(1, historico.size());
    }
}