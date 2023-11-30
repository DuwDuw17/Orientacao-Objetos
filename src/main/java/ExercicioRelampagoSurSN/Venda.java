package ExercicioRelampagoSurSN;

public class Venda extends Transacao{
    private Cliente cliente;

    public Venda(String dataVenda, Cliente cliente, Produto produto, int qtdeVendida){
        super(dataVenda, qtdeVendida, produto);
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //------------------------------------------------------------------------------//

    public boolean vender(Produto produto, int qtdVendida){
        if(produto.verificarEstoqueInsuficiente(qtdVendida)){
            return false;
        } else {
            produto.debitarEstoque(qtdVendida);
            produto.verificarEstoqueBaixo();
            return true;
        }
    }
}
