package Lista1.Exercicio03;

public class ProdutoRoupa extends Produto{

    public float calcularPreco(){
        if(this.getPreco() >= 200.0f){
            return this.getPreco() * 0.8f;
        }
        return this.getPreco();
    }
}
