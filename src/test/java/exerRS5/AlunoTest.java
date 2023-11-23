package exerRS5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno(){  // Letra D
        Aluno aluno = new Aluno();
        Estado estado = new Estado();
        Cidade naturalidade = new Cidade();
        naturalidade.setEstado(estado);
        aluno.setNaturalidade(naturalidade);
        estado.setNome("Minas Gerais");
        assertEquals("Minas Gerais", aluno.getEstadoNaturalidadeAluno());
    }

    @Test
    void deveRetornarEstadoEscolaAluno(){   // Letra F
        Aluno aluno = new Aluno();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();
        Escola escola = new Escola();
        Curso curso = new Curso();
        aluno.setCurso(curso);
        curso.setEscola(escola);
        escola.setCidade(cidade);
        cidade.setEstado(estado);
        estado.setNome("Minas Gerais");
        assertEquals("Minas Gerais", aluno.getEstadoCidadeEscolaCursoAluno());
    }

    @Test
    void deveRetornarCoordenadorCursoAluno(){   // Letra H
        Aluno aluno = new Aluno();
        Professor coordenador = new Professor();
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        aluno.setCurso(curso);
        coordenador.setNome("Pedro");
        assertEquals("Pedro", aluno.getCoordenadorCursoAluno());
    }

}