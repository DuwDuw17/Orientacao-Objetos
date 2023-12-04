package ExercicioRSHP;

import com.sun.nio.sctp.IllegalReceiveException;

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
        if(this.getChefe() == null){
            throw new IllegalArgumentException("Chefe Inválido");
        }
        if(this.getChefe().getEscolaridade() == null){
            throw new IllegalArgumentException("Escolaridade Inválida");
        }
        return this.getChefe().getEscolaridade().getNome();
    }
}
