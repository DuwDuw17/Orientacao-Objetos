package exerRS5;

public class Escola {
    private Cidade cidade;
    private Professor diretor;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        if (cidade == null) {
            throw new IllegalArgumentException("Cidade Inválida");
        }
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if(diretor == null){
            throw new IllegalArgumentException("Diretor Inválido");
        }
        this.diretor = diretor;
    }

    public String getEscolaridadeDiretorEscola(){
        return this.getDiretor().getEscolaridadeProfessor();
    }
}
