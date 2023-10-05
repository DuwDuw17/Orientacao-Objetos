package Prova01;

public class BolsaValores extends CarteiraInvestimento{

    public void investir(){
        this.setSaldo(this.getSaldo() + this.getValorAdicional());
        this.setSaldo(this.getSaldo() - 50.0f); //Aplica a taxa de 50 reais para cada investimento
    }

    public float resgatar() {
        if(this.getSaldo() < this.getValorRetirada()){
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        this.setSaldo(this.getSaldo() - this.getValorRetirada());
        return this.getValorRetirada();
    }
}
