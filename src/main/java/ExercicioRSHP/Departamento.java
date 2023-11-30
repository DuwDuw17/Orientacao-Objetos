package ExercicioRSHP;

public class Departamento {
    private Funcionario chefe;
    private Empresa empresa;

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String escolaridadeChefeDepartamento(){
        return this.getChefe().getEscolaridade().getNome();
    }
}
