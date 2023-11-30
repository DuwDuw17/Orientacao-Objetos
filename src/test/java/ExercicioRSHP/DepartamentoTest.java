package ExercicioRSHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefeDepartamento(){
        Departamento departamento = new Departamento();
        Funcionario chefe = new Funcionario();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Ensino Medio");
        chefe.setEscolaridade(escolaridade);
        departamento.setChefe(chefe);
        assertEquals("Ensino Medio", departamento.escolaridadeChefeDepartamento());
    }

}