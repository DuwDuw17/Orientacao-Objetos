package ExercicioRSHP;

public class Funcionario {

    private String nome;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getPaisFuncionario(){
        if (getAlocacao().getEmpresa() == null){
            throw new IllegalArgumentException("Empresa Inválida");
        }
        if (getAlocacao().getEmpresa().getGrupo() == null){
            throw new IllegalArgumentException("Grupo Inválido");
        }
        if (getAlocacao().getEmpresa().getGrupo().getSede() == null){
            throw new IllegalArgumentException("Sede Inválida");
        }
        return this.getAlocacao().getEmpresa().getGrupo().getSede().getNome();
    }

    public String getEstadoFilialFuncionario(){
        if(getCoordenacao().getCidade() == null){
            throw new IllegalArgumentException("Cidade Inválida");
        }
        if(getCoordenacao().getCidade().getEstado() == null){
            throw new IllegalArgumentException("Estado Inválido");
        }
        return this.getCoordenacao().getCidade().getEstado().getNome();
    }
}
