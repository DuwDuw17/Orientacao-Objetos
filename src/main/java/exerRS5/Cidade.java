package exerRS5;

public class Cidade {
    private String nome;
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if(estado == null){
            throw new IllegalArgumentException("Estado Inválido");
        }
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
