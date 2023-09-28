package Lista1.Exercicio06;

public class ContaCorrente extends ContaBancaria{
    float taxaDeManutencao = 20.0f;

    public void depositar(float valor){
        this.setSaldo(valor);

    }
}
