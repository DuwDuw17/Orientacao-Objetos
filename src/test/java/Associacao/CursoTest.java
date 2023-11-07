package Associacao;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomeCoordenador() {
        Professor coordenador = new Professor();
        coordenador.setNome("Ana");
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        assertEquals("Ana", curso.getNomeCoordenador());
    }

    @Test
    void deveVerificarCursoSemCoordenador() {
        try {
            Curso curso = new Curso();
            curso.getNomeCoordenador();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Curso sem coordenador", e.getMessage());
        }

    }

    @Test
    void deveRetornarNomesProfessoresTurma(){  // QUESTÃO 3
        Curso curso = new Curso();
        Professor professor1 = new Professor();
        professor1.setNome("Joao");
        Professor professor2 = new Professor();
        professor2.setNome("Marcos");
        Turma turma1 = new Turma(new Disciplina(), professor1);
        Turma turma2 = new Turma(new Disciplina(), professor2);
        curso.adicionaTurmaCurso(turma1);
        curso.adicionaTurmaCurso(turma2);
        ArrayList<String> nomesProfessores = curso.getNomesProfessoresTurmaCurso();
        assertEquals(2, nomesProfessores.size());
        assertTrue(nomesProfessores.contains(turma1.getNomeProfessor()));
        assertTrue(nomesProfessores.contains(turma2.getNomeProfessor()));
    }

    @Test
    void deveRetornarNomesAlunoTurmaCurso(){ // QUESTÃO 4
        Curso curso = new Curso();
        Aluno aluno1 = new Aluno(curso);
        aluno1.setNome("Eduardo");
        Aluno aluno2 = new Aluno(curso);
        aluno2.setNome("João");
        Aluno aluno3 = new Aluno(curso);
        aluno3.setNome("Ana");
        Turma turma1 = new Turma(new Disciplina(), new Professor());
        Turma turma2 = new Turma(new Disciplina(), new Professor());
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno3);
        curso.adicionaTurmaCurso(turma1);
        curso.adicionaTurmaCurso(turma2);
        ArrayList<ArrayList<String>> nomesAlunos = curso.getNomeAlunosTurmaCurso();
        assertTrue(nomesAlunos.contains(turma1.getNomesAlunos()));
        assertTrue(nomesAlunos.contains(turma2.getNomesAlunos()));
    }

    @Test
    void deveRetornarNomesAlunosCurso(){  // QUESTÃO 5
        Curso curso = new Curso();
        Aluno aluno = new Aluno(curso);
        aluno.setNome("Eduardo");
        curso.matricularCurso(aluno);
        ArrayList<String> nomesAlunos = curso.getNomesAlunosCurso();
        assertTrue(nomesAlunos.contains(aluno.getNome()));
    }

    @Test
    void deveRetornarDisciplinaTurmaCurso(){  // QUESTÃO 6
        Curso curso = new Curso();
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Teste");
        Turma turma = new Turma(disciplina, new Professor());
        curso.adicionaTurmaCurso(turma);
        ArrayList<String> disciplinas = curso.getNomesDisciplinaTurmaCurso();
        assertEquals(1, disciplinas.size());
        assertTrue(disciplinas.contains(turma.getNomeDisciplina()));
    }

    @Test
    void deveVerificarAlunoCurso(){  // QUESTÃO 8
        Curso curso = new Curso();
        Aluno aluno = new Aluno(curso);
        curso.matricularCurso(aluno);
        assertTrue(curso.verificaMatriculaCurso(aluno));
    }

    @Test
    void deveVerificarTurmaCurso(){  //QUESTÃO 9
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina(), new Professor());
        curso.adicionaTurmaCurso(turma);
        assertTrue(curso.verificaTurmaCurso(turma));
    }

    @Test
    void deveRemoverTurmaCurso(){  //QUESTÃO 11
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina(), new Professor());
        curso.adicionaTurmaCurso(turma);
        curso.removeTurmaCurso(turma);
        assertEquals(0, curso.getNumeroTurmasCurso());
        assertFalse(curso.verificaTurmaCurso(turma));
    }

    @Test
    void deveRemoverAlunoCurso(){  // QUESTÃO 12
        Curso curso = new Curso();
        Aluno aluno = new Aluno(curso);
        curso.matricularCurso(aluno);
        curso.desmatricularCurso(aluno);
        assertEquals(0, curso.getNumeroAlunosCurso());
        assertFalse(curso.verificaMatriculaCurso(aluno));
    }

}