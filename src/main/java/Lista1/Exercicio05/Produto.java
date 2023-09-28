package Lista1.Exercicio05;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private int quantidadeEstoque;
    private int quantidadeComprada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if(quantidadeComprada > this.quantidadeEstoque){
            throw new IllegalArgumentException("Estoque Insuficiente");
        }
        this.quantidadeComprada = quantidadeComprada;
        this.setQuantidadeEstoque(this.getQuantidadeEstoque() - quantidadeComprada);
    }

    public float getDesconto(){
        return 0.0f;
    }
    public float calcularPreco(){
        return this.getQuantidadeComprada() * this.getPrecoUnitario() - this.getDesconto();
    }
}
