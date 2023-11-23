package exerRS5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeProfessorCurso(){   //Letra B
        Curso curso = new Curso();
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        professor.setEscolaridade(escolaridade);
        curso.setCoordenador(professor);
        assertEquals("Mestrado", professor.getEscolaridadeProfessor());
    }

}