package Lista1.Exercicio03;

public class ProdutoEletronico extends Produto{
    public float calcularPreco(){
        if(this.getPreco() >= 300.0f){
            return this.getPreco() * 0.9f;
        }
        return this.getPreco();
    }
}
