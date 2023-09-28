package Lista1.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {
    ProdutoLivro produto;

    @BeforeEach
    void setUp(){
        produto = new ProdutoLivro();
    }

    @Test
    void deveRetornarLivroSemDesconto(){
        produto.setPreco(49.99f);
        assertEquals(49.99f, produto.calcularPreco());
    }

    @Test
    void deveRetornarLivroComDesconto(){
        produto.setPreco(50.0f);
        assertEquals(47.50f, produto.calcularPreco());
    }

}