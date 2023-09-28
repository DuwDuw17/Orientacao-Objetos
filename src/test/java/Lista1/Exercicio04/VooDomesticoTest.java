package Lista1.Exercicio04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    VooDomestico voo;

    @BeforeEach
    void setUp(){
        voo = new VooDomestico();
    }

    @Test
    void deveRetornarPrecoDomestico(){
        voo.setDistancia(300.0f);
        voo.setTaxa(27.0f);
        assertEquals(381.0f, voo.calculaPreco());
    }


}