package Associacao;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private Professor coordenador;
    private ArrayList<Aluno> alunos;
    private ArrayList<Turma> turmas;


    public Curso() {
        this.alunos = new ArrayList<Aluno>();
        this.turmas = new ArrayList<Turma>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public String getNomeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }

    public void matricularCurso(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void desmatricularCurso(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public boolean verificaMatriculaCurso(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getNumeroAlunosCurso() {
        return this.alunos.size();
    }

    public void adicionaTurmaCurso(Turma turma) {
        this.turmas.add(turma);
    }

    public void removeTurmaCurso(Turma turma) {
        this.turmas.remove(turma);
    }

    public int getNumeroTurmasCurso() {
        return this.turmas.size();
    }

    public boolean verificaTurmaCurso(Turma turma) {
        return this.turmas.contains(turma);
    }

    public ArrayList<String> getNomesProfessoresTurmaCurso() {
        ArrayList<String> nomesProfessores = new ArrayList<String>();
        for (int i = 0; i < this.turmas.size(); i++) {
            Turma turma = this.turmas.get(i);
            nomesProfessores.add(turma.getProfessor().getNome());
        }
        return nomesProfessores;
    }

    public ArrayList<ArrayList<String>> getNomeAlunosTurmaCurso() {
        ArrayList<ArrayList<String>> nomesAlunos = new ArrayList<>();
        for (int i = 0; i < this.turmas.size(); i++) {
            Turma turma = this.turmas.get(i);
            nomesAlunos.add(turma.getNomesAlunos());
        }
        return nomesAlunos;
    }

    public ArrayList<String> getNomesAlunosCurso() {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            nomesAlunos.add(aluno.getNome());
        }
        return nomesAlunos;
    }

    public ArrayList<String> getNomesDisciplinaTurmaCurso() {
        ArrayList<String> disciplina = new ArrayList<String>();
        for (int i = 0; i < this.turmas.size(); i++) {
            Turma turma = this.turmas.get(i);
            disciplina.add(turma.getDisciplina().getNome());
        }
        return disciplina;
    }
}
