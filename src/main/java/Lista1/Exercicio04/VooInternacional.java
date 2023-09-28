package Lista1.Exercicio04;

public class VooInternacional extends Voo{

    private float taxaConversao;

    public float getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(float taxaConversao) {
        this.taxaConversao = taxaConversao/100.0f;
    }

    public float calculaPreco(){
        if(this.getDistancia() >= 750.0f){
            return this.getDistancia() * (1 + super.getTaxa() + this.getTaxaConversao());
        }
        return this.getDistancia() * (1 + super.getTaxa());
    }
}
