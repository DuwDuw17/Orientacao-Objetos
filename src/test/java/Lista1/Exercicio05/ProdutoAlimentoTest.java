package Lista1.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {
    ProdutoAlimento alimento;

    @Test
    void naoDeveComprarAlimEstoque(){
        try{
            ProdutoAlimento produto = new ProdutoAlimento();
            produto.setQuantidadeEstoque(10);
            produto.setQuantidadeComprada(11);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Estoque Insuficiente", e.getMessage());
        }
    }

    @Test
    void deveComprarQuantidadeAbaixoEstoque(){
        ProdutoAlimento produto = new ProdutoAlimento();
        produto.setQuantidadeEstoque(100);
        produto.setQuantidadeComprada(100);
        assertEquals(0, produto.getQuantidadeEstoque());
    }

    @Test
    void deveCalcularPreco(){
        ProdutoAlimento produto = new ProdutoAlimento();
        produto.setQuantidadeEstoque(100);
        produto.setQuantidadeComprada(100);
        produto.setPrecoUnitario(10.0f);
        assertEquals(1000.0f, produto.calcularPreco());
    }

}