package ExercicioRelampago1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    AlunoEnsinoMedio aluno;

    @BeforeEach
    void setUp() {
        aluno = new AlunoEnsinoMedio();
    }

    @Test
    void deveRetornarAprovado() {
        aluno.setNota1(6);
        aluno.setNota2(6);
        assertTrue(aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado() {
        aluno.setNota1(5);
        aluno.setNota2(6);
        assertFalse(aluno.verificarAprovacao());
    }

}