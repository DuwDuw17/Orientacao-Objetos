package Lista1.Exercicio02;

public class Gerente extends Funcionario{
    private float bonus;

    public float getBonus() {
        return this.bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float calcularPagamento(){
        return getSalarioMensal() + getBonus();
    }
}
