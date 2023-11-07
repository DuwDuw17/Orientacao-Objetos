package Associacao;

public class Aluno extends Pessoa{

    private Curso curso;
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        if(turma == null){
            throw new IllegalArgumentException("Turma invalida");
        }
        this.turma = turma;
    }

    public Aluno(Curso curso){
        this.setCurso(curso);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if(curso == null){
            throw new IllegalArgumentException("Curso invalido");
        }
        this.curso = curso;
    }

    public String getNomeCurso(){
        return this.curso.getNome();
    }
}
