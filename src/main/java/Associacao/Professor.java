package Associacao;

public class Professor extends Pessoa{
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
}
