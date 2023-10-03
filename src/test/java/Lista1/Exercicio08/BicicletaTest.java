package Lista1.Exercicio08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void deveCalcularCusto(){
        Bicicleta bike = new Bicicleta();
        bike.setPrecoBase(1000);
        assertEquals(2000, bike.calcularCusto());
    }

}