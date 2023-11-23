package exerRS5;

public class Curso {
    private TipoEnsino tipoEnsino;
    private Escola escola;
    private Professor coordenador;

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        if(tipoEnsino == null){
            throw new IllegalArgumentException("Tipo de Ensino Inválido");
        }
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        if(escola == null){
            throw new IllegalArgumentException("Escola Inválida");
        }
        this.escola = escola;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if(coordenador == null){
            throw new IllegalArgumentException("Coordenador Inválido");
        }
        this.coordenador = coordenador;
    }

    public String escolaridadeCoordenadorCurso(){
        return this.getCoordenador().getEscolaridade().getNome();
    }

}
