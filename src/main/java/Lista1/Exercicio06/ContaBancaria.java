package Lista1.Exercicio06;

public abstract class ContaBancaria {
    private String nome;
    private int numConta;
    private float saldo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract void depositar(float valorDeposito);

    public void sacar(float valorSaque){
        if(valorSaque > this.saldo){
            throw new IllegalArgumentException("Não tem saldo para isso");
        }
    }

    public abstract float calcularJuros();
}
