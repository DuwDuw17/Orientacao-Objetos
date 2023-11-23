package exerRS5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarEscolaridadeProfessor(){   //Letra A
        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        professor.setEscolaridade(escolaridade);
        assertEquals("Mestrado", professor.getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarNomeCidadeProfessor(){   // Letra E
        Professor professor = new Professor();
        Cidade cidade = new Cidade();
        cidade.setNome("Juiz de Fora");
        professor.setNaturalidade(cidade);
        assertEquals("Juiz de Fora", professor.getNomeCidadeProfessor());
    }

    @Test
    void deveRetornarTipoEnsinoContratacaoProfessor(){  // Letra G
        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        Curso contratacao = new Curso();
        tipoEnsino.setNome("Presencial");
        contratacao.setTipoEnsino(tipoEnsino);
        professor.setContratacao(contratacao);
        assertEquals("Presencial", professor.getTipoEnsinoContratacaoProfessor());
    }

    @Test
    void deveRetornarDiretorProfessor(){   // Letra I
        Professor professor = new Professor();
        Professor diretor = new Professor();
        Escola escola = new Escola();
        Curso curso = new Curso();
        escola.setDiretor(diretor);
        curso.setEscola(escola);
        professor.setContratacao(curso);
        diretor.setNome("Ana");
        assertEquals("Ana", professor.getDiretorProfessor());
    }

    @Test
    void deveRetornarCoordenadorProfessor(){   // Letra J
        Professor professor = new Professor();
        Professor coordenador = new Professor();
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        professor.setContratacao(curso);
        coordenador.setNome("Gabriel Pec");
        assertEquals("Gabriel Pec", professor.getCoordenadorProfessor());
    }
}