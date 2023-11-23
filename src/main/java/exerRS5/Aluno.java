package exerRS5;

public class Aluno extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if(curso == null){
            throw new IllegalArgumentException("Curso Inválido");
        }
        this.curso = curso;
    }

    public String getEstadoNaturalidadeAluno() {
        return this.getNaturalidade().getEstado().getNome();
    }

    public String getEstadoCidadeEscolaCursoAluno(){
        return this.getCurso().getEscola().getCidade().getEstado().getNome();
    }

    public String getCoordenadorCursoAluno(){
        return this.getCurso().getCoordenador().getNome();
    }
}
