package Lista1.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo forma;

    @BeforeEach
    void setUp(){
        forma = new Retangulo();
    }

    @Test
    void deveRetornarRetanguloArea(){
        forma.setComprimento(1.0f);
        forma.setLargura(1.0f);
        assertEquals(1.0f, forma.calcularArea());
    }

    @Test
    void deveRetornarRetanguloPerimetro(){
        forma.setComprimento(1.0f);
        forma.setLargura(1.0f);
        assertEquals(4.0f, forma.calcularPerimetro());
    }
}