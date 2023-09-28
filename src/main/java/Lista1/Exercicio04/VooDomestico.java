package Lista1.Exercicio04;

public class VooDomestico extends Voo{
    public float calculaPreco() {
        return this.getDistancia() * (1 + super.getTaxa());
    }
}
