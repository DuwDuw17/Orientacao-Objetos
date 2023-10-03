package Lista1.Exercicio08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveCalcularCusto(){
        Moto moto = new Moto();
        moto.setPrecoBase(30000);
        assertEquals(90000, moto.calcularCusto());
    }

}