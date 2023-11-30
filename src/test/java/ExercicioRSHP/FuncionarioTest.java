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
        assertEquals("Brasil", funcionario.paisFuncionario());
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
        assertEquals("Minas Gerais", coordenador.estadoFilialFuncionario());
    }

}