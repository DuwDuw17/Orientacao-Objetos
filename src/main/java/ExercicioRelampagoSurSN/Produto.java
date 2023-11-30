package ExercicioRelampagoSurSN;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private int precoUnitario;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private ArrayList<String> historico;

    public Produto(String nome, int qtdeEstoque, int precoUnitario, int estoqueMinimo, int estoqueMaximo){
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnitario = precoUnitario;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
        this.historico = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(int precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    //-------------------------------------------------------------------------------------------//

    public void debitarEstoque(int diminuirEstoque){
        if(diminuirEstoque > qtdeEstoque){
            throw new IllegalArgumentException("Estoque inválido");
        }
        this.qtdeEstoque = this.qtdeEstoque - diminuirEstoque;
    }

    public void creditarEstoque(int aumentarEstoque){
        if(aumentarEstoque < 0){
            throw new IllegalArgumentException("Impossivel aumentar estoque");
        }
        qtdeEstoque = qtdeEstoque + aumentarEstoque;
    }

    public boolean verificarEstoqueBaixo(){
        if(qtdeEstoque < estoqueMinimo){
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueInsuficiente(int quantidade){
        if(quantidade > qtdeEstoque){
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarEstoqueExcedente(int quantidade){
        if((quantidade + qtdeEstoque) > estoqueMaximo){
            return true;
        } else {
            return false;
        }
    }

    public int calcularValorVenda(int quantidade){
        return (this.precoUnitario * quantidade);
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida){
        Venda venda = new Venda(dataVenda, cliente, this, qtdeVendida);
        if(venda.vender(this, qtdeVendida)){
            this.historico.add("Venda realizada: " + qtdeVendida + " unidades");
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, int precoUnit){
        Compra compra = new Compra(dataCompra, this, fornecedor, qtdeCompra, precoUnit);
        if(compra.comprar(this, qtdeCompra)){
            this.historico.add("Compra realizada: " + qtdeCompra + " unidades");
        }
    }

    public void regsistrarHistorico(String transacao){
        this.historico.add(transacao);
    }

    public ArrayList<String> exibirHistorico(){
        return this.historico;
    }
}

