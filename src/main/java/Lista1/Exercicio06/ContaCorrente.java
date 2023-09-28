package Lista1.Exercicio06;

public class ContaCorrente extends ContaBancaria{
    private float taxaDeManutencao;

    public float getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    public void setTaxaDeManutencao(float taxaDeManutencao) {
        this.taxaDeManutencao = taxaDeManutencao;
    }

    public void depositar(float valorDeposito){
        if(valorDeposito <= 0.0f){
            throw new IllegalArgumentException("Valor Inválido");
        }
        this.setSaldo(this.getSaldo() + valorDeposito - this.taxaDeManutencao);
        this.taxaDeManutencao = 0.0f;
        //Tera que fazer caso de teste para ver se ta cobrando na segunda transação
    }
}
