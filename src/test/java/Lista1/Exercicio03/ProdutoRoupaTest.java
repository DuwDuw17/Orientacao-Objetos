package Lista1.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {
    ProdutoRoupa produto;

    @BeforeEach
    void setUp(){
        produto = new ProdutoRoupa();
    }

    @Test
    void deveRetornarRoupaSemDesconto(){
        produto.setPreco(199.99f);
        assertEquals(199.99f, produto.calcularPreco());
    }

    @Test
    void deveRetornarRoupaComDesconto(){
        produto.setPreco(200.0f);
        assertEquals(160.0f, produto.calcularPreco());
    }

}