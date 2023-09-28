package Lista1.Exercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {
    ProdutoEletronico produto;

    @BeforeEach
    void setUp(){
        produto = new ProdutoEletronico();
    }

    @Test
    void deveRetornarEletronicoSemDesconto(){
        produto.setPreco(299.99f);
        assertEquals(299.99f, produto.calcularPreco());
    }

    @Test
    void deveRetornarEletronicoComDesconto(){
        produto.setPreco(300.0f);
        assertEquals(270.0f, produto.calcularPreco());
    }
}