package ExercicioRSHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacaoFuncionario(){
        Funcionario funcionario = new Funcionario();
        Departamento alocacao = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais sede = new Pais();
        sede.setNome("Brasil");
        grupo.setSede(sede);
        empresa.setGrupo(grupo);
        alocacao.setEmpresa(empresa);
        funcionario.setAlocacao(alocacao);
        assertEquals("Brasil", funcionario.getPaisFuncionario());
    }

    @Test
    void deveRetornarEstadoFilialFuncionario(){
        Funcionario coordenador = new Funcionario();
        Filial filial = new Filial();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        estado.setNome("Minas Gerais");
        cidade.setEstado(estado);
        filial.setCidade(cidade);
        coordenador.setCoordenacao(filial);
        assertEquals("Minas Gerais", coordenador.getEstadoFilialFuncionario());
    }

    @Test
    void deveRetornarCidadeInvalida(){
        try{
            Funcionario coordenador = new Funcionario();
            Filial filial = new Filial();
            coordenador.setCoordenacao(filial);
            coordenador.getEstadoFilialFuncionario();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Cidade Inválida", e.getMessage());
        }

    }

    @Test
    void deveRetornarEstadoInvalido(){
        try{
            Funcionario coordenador = new Funcionario();
            Filial filial = new Filial();
            Cidade cidade = new Cidade();
            filial.setCidade(cidade);
            coordenador.setCoordenacao(filial);
            coordenador.getEstadoFilialFuncionario();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Estado Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEmpresaInvalida(){
        try{
            Funcionario funcionario = new Funcionario();
            Departamento alocacao = new Departamento();
            funcionario.setAlocacao(alocacao);
            funcionario.getPaisFuncionario();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Empresa Inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarGrupoInvalido(){
        try{
            Funcionario funcionario = new Funcionario();
            Departamento alocacao = new Departamento();
            Empresa empresa = new Empresa();
            funcionario.setAlocacao(alocacao);
            alocacao.setEmpresa(empresa);
            funcionario.getPaisFuncionario();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Grupo Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSedeInvalida(){
        try{
            Funcionario funcionario = new Funcionario();
            Departamento alocacao = new Departamento();
            Empresa empresa = new Empresa();
            Grupo grupo = new Grupo();
            empresa.setGrupo(grupo);
            funcionario.setAlocacao(alocacao);
            alocacao.setEmpresa(empresa);
            funcionario.getPaisFuncionario();
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Sede Inválida", e.getMessage());
        }
    }

}