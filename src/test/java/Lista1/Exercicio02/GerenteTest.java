package Lista1.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    Gerente gerente;

    @BeforeEach
    void setUp(){
        gerente = new Gerente();
    }

    @Test
    void deveRetornarSalarioGerente(){
        gerente.setBonus(1000.0f);
        gerente.setSalarioMensal(1000.0f);
        assertEquals(2000.0f, gerente.calcularPagamento());
    }
}