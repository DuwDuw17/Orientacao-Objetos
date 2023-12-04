package ExercicioRSHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void deveRetornarEscolaridadePresidenteGrupo(){
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Ensino Medio");
        grupo.setPresidente(presidente);
        presidente.setEscolaridade(escolaridade);
        assertEquals("Ensino Medio", grupo.escolaridadePresidenteGrupo());
    }

    @Test
    void deveRetornarEscolaridadeNull(){
        try{
            Funcionario presidente = new Funcionario();
            Grupo grupo = new Grupo();
            grupo.setPresidente(presidente);
            grupo.escolaridadePresidenteGrupo();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Escolaridade Inválida", e.getMessage());
        }
    }
}