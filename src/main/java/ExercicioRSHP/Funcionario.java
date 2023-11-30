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

    public String paisFuncionario(){
        return this.getAlocacao().getEmpresa().getGrupo().getSede().getNome();
    }

    public String estadoFilialFuncionario(){
        return this.getCoordenacao().getCidade().getEstado().getNome();
    }
}
