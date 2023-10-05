package Prova01;

public class Investimento extends CarteiraInvestimento{
    public void investir(){
        this.setSaldo(this.getSaldo() + this.getValorAdicional());
    }

    public float resgatar() {
        if(this.getSaldo() < this.getValorRetirada()){
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        this.setSaldo(this.getSaldo() - this.getValorRetirada());
        return this.getValorRetirada() * 0.99f;
    }
}
