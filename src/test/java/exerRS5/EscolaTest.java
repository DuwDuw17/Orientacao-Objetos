package exerRS5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretorEscola(){   // Letra C
        Escola escola = new Escola();
        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        diretor.setEscolaridade(escolaridade);
        escola.setDiretor(diretor);
        assertEquals("Mestrado", escola.getEscolaridadeDiretorEscola());
    }

}