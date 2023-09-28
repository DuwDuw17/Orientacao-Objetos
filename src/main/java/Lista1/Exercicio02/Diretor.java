package Lista1.Exercicio02;

public class Diretor extends Funcionario{
    private float lucroEmpresa;

    public float getLucroEmpresa() {
        return this.lucroEmpresa;
    }

    public void setLucroEmpresa(float lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    public float calcularPagamento(){
        return getSalarioMensal() + (0.10f * getLucroEmpresa());
    }
}
