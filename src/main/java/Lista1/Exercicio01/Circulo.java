package Lista1.Exercicio01;

public class Circulo extends FormasGeometricas{
    private float raio;

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.14f * (raio * raio);
    }

    public double calcularPerimetro(){
        return 2 * raio * 3.14f;
    }
}
