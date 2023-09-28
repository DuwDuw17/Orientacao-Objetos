package Lista1.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {
    ProdutoAlimento alimento;

    @BeforeEach
    void setUp(){
        alimento = new ProdutoAlimento();
    }

    @Test
    void deveRetornarAlimentoComDesconto(){
        alimento.setQuantidadeComprada(6);
        alimento.setPrecoUnitario(5.0f);
        assertEquals(25.5f, alimento.calcularPreco());
    }

    @Test
    void deveRetornarAlimentoSemDesconto(){
        alimento.setQuantidadeComprada(5);
        alimento.setPrecoUnitario(5.0f);
        assertEquals(25.0f, alimento.calcularPreco());
    }

}