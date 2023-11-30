package ExercicioRSHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomeDiretor(){
        Filial filial = new Filial();
        Funcionario diretor = new Funcionario();
        Empresa empresa = new Empresa();
        diretor.setNome("Vasco");
        empresa.setDiretor(diretor);
        filial.setEmpresa(empresa);
        assertEquals("Vasco", filial.nomeDiretorEmpresaFilial());
    }
}