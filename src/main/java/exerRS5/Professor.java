package exerRS5;

public class Professor extends Pessoa{
    private Curso contratacao;

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        if(contratacao == null){
            throw new IllegalArgumentException("Contratacao Inválidada");
        }
        this.contratacao = contratacao;
    }

    public String getEscolaridadeProfessor(){
        return this.getEscolaridade().getNome();
    }

    public String getNomeCidadeProfessor(){
        return this.getNaturalidade().getNome();
    }

    public String getTipoEnsinoContratacaoProfessor(){
        return this.contratacao.getTipoEnsino().getNome();
    }

    public String getDiretorProfessor(){
        return this.getContratacao().getEscola().getDiretor().getNome();
    }

    public String getCoordenadorProfessor(){
        return this.getContratacao().getCoordenador().getNome();
    }
}
