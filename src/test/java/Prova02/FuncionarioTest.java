package Prova02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarSalarioLiquido(){
        TesteData data1 = new TesteData(new Date());
        data1.adicionarDias(5);
        TesteData data2 = new TesteData(new Date());
        data2.adicionarDias(10000);

        Funcionario funcionario = new Funcionario();
        Cargo cargo = new Cargo();
        cargo.setSalarioBruto(1000);
        funcionario.setCargo(cargo);

        Dependente dependente1 = new Dependente();
        dependente1.setDataNascimento(data1);
        Dependente dependente2 = new Dependente();
        dependente2.setDataNascimento(data2);         //ADICIONA 100 POR UM SER MAIOR DE 18 ANOS

        ArrayList<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dependente1);
        dependentes.add(dependente2);
        funcionario.setDependentes(dependentes);

        Ocorrencia ocorrencia = new Ocorrencia();
        ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
        ocorrencia.setDataOcorrencia(data1);
        ocorrencia.setValorAcrescimo(100);     //ADICIONA 100 POR ESTAR NO MESMO MES E ANO
        ocorrencias.add(ocorrencia);
        funcionario.setOcorrencias(ocorrencias);

        assertEquals(1200, funcionario.calcularSalarioLiquido(10, 2023));
    }


    @Test
    void deveRetornarNomesDependentes(){
        Funcionario funcionario = new Funcionario();
        Dependente dependente1 = new Dependente();
        Dependente dependente2 = new Dependente();
        ArrayList<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dependente1);
        dependente1.setNome("João");
        dependentes.add(dependente2);
        funcionario.setDependentes(dependentes);
        ArrayList<String> nomes = new ArrayList<>();
        assertEquals(2, funcionario.getDependentes().size());
    }

}