package ExercicioRelampago1;

public class AlunoEnsinoMedio extends Aluno {

    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 6;
    }
}
