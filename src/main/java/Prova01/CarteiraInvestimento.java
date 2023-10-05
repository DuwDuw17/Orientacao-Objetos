package Prova01;

public abstract class CarteiraInvestimento {
    private int numeroCarteira;
    private float saldo;
    private float valorAdicional;
    private float valorRetirada;

    public float getValorRetirada() {
        return this.valorRetirada;
    }

    public void setValorRetirada(float valorRetirada) {
        this.valorRetirada = valorRetirada;
    }

    public float getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        if(valorAdicional < 0.0f){
            throw new IllegalArgumentException("Valor Inválido");
        }
        this.valorAdicional = valorAdicional;
    }

    public int getNumeroCarteira() {
        return this.numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0.0){
            throw new IllegalArgumentException("Saldo Inválido");
        }
        this.saldo = saldo;
    }

    public abstract void investir();
    public abstract float resgatar();
}
