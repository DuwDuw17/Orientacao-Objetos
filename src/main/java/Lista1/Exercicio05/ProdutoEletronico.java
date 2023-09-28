package Lista1.Exercicio05;

public class ProdutoEletronico extends Produto{
    float desconto = 0.1f;

    public float calcularPreco(){
        if(this.getQuantidadeComprada() >= 4 && this.getPrecoUnitario() >= 15.0f){
            return this.getQuantidadeComprada() * this.getPrecoUnitario() * (1 - desconto);
        }
        return this.getQuantidadeComprada() * this.getPrecoUnitario();
    }
}
