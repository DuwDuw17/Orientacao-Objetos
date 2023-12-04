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

    @Test
    void deveRetornarEmpresaInvalida(){
        try{
            Filial filial = new Filial();
            filial.nomeDiretorEmpresaFilial();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Empresa Inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarDiretorInvalida(){
        try{
            Filial filial = new Filial();
            Empresa empresa = new Empresa();
            filial.setEmpresa(empresa);
            filial.nomeDiretorEmpresaFilial();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Diretor Inválido", e.getMessage());
        }
    }
}