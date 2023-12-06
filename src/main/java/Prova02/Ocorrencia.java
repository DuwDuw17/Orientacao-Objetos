package Prova02;

// NOME: Eduardo Salzer Simas

import java.util.Date;

public class Ocorrencia {
    private TesteData dataOcorrencia;
    private int valorAcrescimo;
    private int valorDesconto;
    private String descricaoOcorrencia;

    public TesteData getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(TesteData dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public int getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(int valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public int getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(int valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getDescricaoOcorrencia() {
        return descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }

}
