package Lista1.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    ProdutoAlimento produto;
    @BeforeEach
    void setUp(){
        produto = new ProdutoAlimento();
    }

    @Test
    void naoDeveComprarAlemEstoque() {
        try {
            produto.setQuantidadeEstoque(100.0f);
            produto.setQuantidadeComprada(100.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveComprarQuantidadeAbaixoEstoque() {
        produto.setQuantidadeEstoque(100.0f);
        produto.setQuantidadeComprada(100.0f);
        assertEquals(0.0f, produto.getQuantidadeEstoque());
    }

    @Test
    void deveCalcularPreco() {
        produto.setPrecoUnitario(10.0f);
        produto.setQuantidadeEstoque(2.0f);
        produto.setQuantidadeComprada(2.0f);
        assertEquals(20.0f, produto.calcularPreco());
    }

}