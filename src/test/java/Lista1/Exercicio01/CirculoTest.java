package Lista1.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo forma;

    @BeforeEach
    void setUp(){
        forma = new Circulo();
    }

    @Test
    void deveRetornarCirculoArea(){
        forma.setRaio(1.0f);
        assertEquals(3.14f, forma.calcularArea());
    }

    @Test
    void deveRetornarCirculoPerimetro(){
        forma.setRaio(1.0f);
        assertEquals(6.28f, forma.calcularPerimetro());
    }

}