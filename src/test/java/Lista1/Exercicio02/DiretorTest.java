package Lista1.Exercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    Diretor diretor;

    @BeforeEach
    void setUp(){
        diretor = new Diretor();
    }

    @Test
    void deveRetornarSalarioDiretor(){
        diretor.setLucroEmpresa(1000.0f);
        diretor.setSalarioMensal(1000.0f);
        assertEquals(1100.0f, diretor.calcularPagamento());
    }
}