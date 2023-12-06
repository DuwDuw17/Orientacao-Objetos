package Prova02;

// NOME: Eduardo Salzer Simas

import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Pessoa{
    private Cargo cargo;
    private ArrayList<Ocorrencia> ocorrencias;
    private ArrayList<Dependente> dependentes;

    public Funcionario(){
        this.ocorrencias = new ArrayList<>();
        this.dependentes = new ArrayList<>();
    }
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(ArrayList<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public int calcularSalarioLiquido(int mes, int ano){
        int salarioLiquido = 0;

        int salarioBruto = this.getCargo().getSalarioBruto();

        int acrescimosEDescontos = 0;
        for (int i = 0; i < this.ocorrencias.size(); i++){
            if(this.ocorrencias.get(i).getDataOcorrencia().getMesData() == mes
            && this.ocorrencias.get(i).getDataOcorrencia().getAnoData() == ano){
                acrescimosEDescontos = acrescimosEDescontos + this.ocorrencias.get(i).getValorAcrescimo() - this.ocorrencias.get(i).getValorDesconto();
            }
        }

        Date dataAux = new Date();
        TesteData dataHoje = new TesteData(dataAux);
        dataAux = dataHoje.getDataAtual();
        TesteData auxAnoHoje = new TesteData(dataAux);
        int anoHoje = auxAnoHoje.getAnoData();

        int acrescentaCem = 0;
        for (int i = 0; i < this.dependentes.size(); i++){
            if((this.dependentes.get(i).getDataNascimento().getAnoData() - anoHoje) >= 18){
                acrescentaCem = acrescentaCem + 100;
            }
        }

        salarioLiquido = salarioBruto + acrescimosEDescontos + acrescentaCem;

        return salarioLiquido;
    }

    public ArrayList<String> exibirDependentes(){
        ArrayList<String> nomesDependentes = new ArrayList<>();
        for (int i = 0; i < this.dependentes.size(); i++){
            nomesDependentes.add(this.dependentes.get(i).getNome());
        }

        Date dataAux = new Date();
        TesteData dataHoje = new TesteData(dataAux);
        dataAux = dataHoje.getDataAtual();
        TesteData auxAnoHoje = new TesteData(dataAux);
        int anoHoje = auxAnoHoje.getAnoData();

        ArrayList<TesteData> datasProxAniversarios = new ArrayList<>();
        for (int i = 0; i < this.dependentes.size(); i++){
            int ano = this.dependentes.get(i).getDataNascimento().getAnoData();
            int idade = anoHoje - ano;
            int idadeEmDias = idade * 365;
            TesteData dataProxAniversario = new TesteData(dataAux);
            datasProxAniversarios.add(dataProxAniversario);
        }

        return nomesDependentes;
    }
}
