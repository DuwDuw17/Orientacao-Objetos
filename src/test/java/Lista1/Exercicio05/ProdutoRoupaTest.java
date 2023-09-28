package Lista1.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    ProdutoRoupa roupa;

    @BeforeEach
    void setUp(){
        roupa = new ProdutoRoupa();
    }

    @Test
    void deveRetornarRoupaComDesconto(){
        roupa.setQuantidadeComprada(3);
        roupa.setPrecoUnitario(25.0f);
        assertEquals(63.75, roupa.calcularPreco());
    }

    @Test
    void deveRetornarRoupaSemDesconto(){
        roupa.setQuantidadeComprada(2);
        roupa.setPrecoUnitario(25);
        assertEquals(50.0f, roupa.calcularPreco());
    }

}