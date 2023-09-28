package Lista1.Exercicio05;

public class ProdutoRoupa extends Produto{
    float desconto = 0.15f;

    public float calcularPreco(){
        if(this.getQuantidadeComprada() >= 3 && this.getPrecoUnitario() >= 25){
            return this.getQuantidadeComprada() * this.getPrecoUnitario() * (1 - desconto);
        }
        return this.getQuantidadeComprada() * this.getPrecoUnitario();
    }
}
