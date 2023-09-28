package Lista1.Exercicio04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {

    Voo voo;

    @BeforeEach
    void setUp()
    {
        voo = new VooDomestico();
    }

    @Test
    void deveRetornarData() throws ParseException
    {
        voo.setData("27/09/2023");
        assertEquals("27/09/2023", new SimpleDateFormat("dd/MM/yyyy").format(voo.getData()));
    }
    @Test
    void deveRetornarOrigem()
    {
        voo.setOrigem("Juiz de Fora");
        assertEquals("Juiz de Fora", voo.getOrigem());
    }

    @Test
    void deveRetornarDestino()
    {
        voo.setDestino("Belo Horizonte");
        assertEquals("Belo Horizonte", voo.getDestino());
    }


}