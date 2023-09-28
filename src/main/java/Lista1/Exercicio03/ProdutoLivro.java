package Lista1.Exercicio03;

public class ProdutoLivro extends Produto{

    public float calcularPreco(){
        if(this.getPreco() >= 50.0f){
            return this.getPreco() * 0.95f;
        }
        return this.getPreco();
    }
}
