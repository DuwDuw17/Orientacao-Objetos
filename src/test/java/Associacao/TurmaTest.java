package Associacao;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveMatricularAluno() {
        Aluno aluno = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina(), new Professor());
        turma.matricular(aluno);
        assertEquals(1, turma.getNumeroAlunos());
        assertTrue(turma.verificaMatricula(aluno));
    }

    @Test
    void deveDesmatricularAlunoTurma() {  // QUESTÃO 10
        Aluno aluno = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina(), new Professor());
        turma.matricular(aluno);
        turma.desmatricular(aluno);
        assertEquals(0, turma.getNumeroAlunos());
        assertFalse(turma.verificaMatricula(aluno));
    }

    @Test
    void deveMatricularDoisAlunos() {
        Aluno aluno1 = new Aluno(new Curso());
        Aluno aluno2 = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina(), new Professor());
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        assertEquals(2, turma.getNumeroAlunos());
        assertTrue(turma.verificaMatricula(aluno1));
        assertTrue(turma.verificaMatricula(aluno2));
    }

    @Test
    void deveRetornarNomeProfessorTurma(){    // QUESTÃO 1
        Professor professor = new Professor();
        professor.setNome("Dudu");
        Turma turma = new Turma(new Disciplina(), professor);
        assertEquals("Dudu", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarNomeAlunosTurma(){   // QUESTÃO 2
        Aluno aluno1 = new Aluno(new Curso());
        Aluno aluno2 = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina(), new Professor());
        aluno1.setNome("Dudu");
        aluno2.setNome("Rafa");
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        ArrayList<String> nomesAlunos = turma.getNomesAlunos();
        assertEquals(2, nomesAlunos.size());
        assertTrue(nomesAlunos.contains(aluno1.getNome()));
        assertTrue(nomesAlunos.contains(aluno2.getNome()));

    }

    @Test
    void deveVerificarAlunoTurma(){  //QUESTÃO 7
        Aluno aluno = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina(), new Professor());
        turma.matricular(aluno);
        assertTrue(turma.verificaMatricula(aluno));
    }
}