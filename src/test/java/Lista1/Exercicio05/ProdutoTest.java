package Lista1.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto produto;

    @BeforeEach
    void setUp(){
        produto = new ProdutoEletronico();
    }

    @Test
    void deveRetornarNome(){
        produto.setNome("notebook");
        assertEquals("notebook", produto.getNome());
    }

    @Test
    void deveRetornarQuantidadeEstoqueAposCompra(){
        produto.setQuantidadeEstoque(100);
        produto.setQuantidadeComprada(10);
        assertEquals(90, produto.getQuantidadeEstoque());
    }

}