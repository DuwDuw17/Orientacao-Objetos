package Lista1.Exercicio05;

public class ProdutoAlimento extends Produto{
    float desconto = 0.15f;

    public float calcularPreco(){
        if(this.getQuantidadeComprada() >= 6 && this.getPrecoUnitario() >= 5.0f){
            return this.getPrecoUnitario() * this.getQuantidadeComprada() * (1 - desconto);
        }
        return this.getPrecoUnitario() * this.getQuantidadeComprada();
    }
}
