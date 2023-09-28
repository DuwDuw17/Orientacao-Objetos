package Lista1.Exercicio05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {
    ProdutoEletronico eletronico;

    @BeforeEach
    void setUp(){
        eletronico = new ProdutoEletronico();
    }

    @Test
    void deveCalcularPrecoSemDesconto(){
        eletronico.setPrecoUnitario(15.0f);
        eletronico.setQuantidadeComprada(3);
        assertEquals(45, eletronico.calcularPreco());
    }

    @Test
    void deveRetornarPrecoComDesconto(){
        eletronico.setPrecoUnitario(15.0f);
        eletronico.setQuantidadeComprada(4);
        assertEquals(54, eletronico.calcularPreco());
    }

}