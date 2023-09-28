package Lista1.Exercicio04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest
{
    VooInternacional internacional;

    @BeforeEach
    void setUp()
    {
        internacional = new VooInternacional();
    }

    @Test
    void deveRetornarPrecoTaxado()
    {
        internacional.setDistancia(750f);
        internacional.setTaxa(44.0f);
        internacional.setTaxaConversao(32.0f);
        assertEquals(1320.0f, internacional.calculaPreco());
    }

    @Test
    void deveRetornarPrecoSemTaxa()
    {
        internacional.setDistancia(749.99f);
        internacional.setTaxa(38);
        assertEquals(1034.9862f, internacional.calculaPreco());
    }
}