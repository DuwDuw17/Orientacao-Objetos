package Associacao;

import java.util.ArrayList;

public class Turma {

    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    public Turma(Disciplina disciplina, Professor professor) {
        this.alunos = new ArrayList<Aluno>();
        this.setDisciplina(disciplina);
        this.setProfessor(professor);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if(disciplina == null) {
            throw new IllegalArgumentException("Disciplina Inválida");
        }
        this.disciplina = disciplina;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void desmatricular(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public boolean verificaMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getNumeroAlunos(){
        return this.alunos.size();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessor(){
        if(this.professor == null){
            throw new NullPointerException("Turma sem professor");
        }
        return this.professor.getNome();
    }

    public String getNomeDisciplina(){
        if(this.disciplina == null){
            throw new NullPointerException("Turma sem disciplina");
        }
        return this.disciplina.getNome();
    }

    public ArrayList<String> getNomesAlunos(){
        ArrayList<String> nomesAlunos = new ArrayList<String>();
        for (int i = 0; i < this.alunos.size(); i++){
            Aluno aluno = this.alunos.get(i);
            nomesAlunos.add(aluno.getNome());
        }
        return nomesAlunos;
    }
}
