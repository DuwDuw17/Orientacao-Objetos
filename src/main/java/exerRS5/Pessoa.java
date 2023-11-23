package exerRS5;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

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
        if(escolaridade == null){
            throw new IllegalArgumentException("EScolaridade Inválida");
        }
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        if(naturalidade == null){
            throw new IllegalArgumentException("Naturalidade Inválida");
        }
        this.naturalidade = naturalidade;
    }
}
