package ExercicioRelampagoSurSN;

public class Compra extends Transacao{
    private int precoUnit;
    private Fornecedor fornecedor;
    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeComprada, int precoUnit){
        super(dataCompra, qtdeComprada, produto);
        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;
    }

    public int getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(int precoUnit) {
        this.precoUnit = precoUnit;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //---------------------------------------------------------------------------------------------------------//

    public boolean comprar(Produto produto, int qtdeCompra){
        if(produto.verificarEstoqueExcedente(qtdeCompra)){
            return false;
        } else {
            produto.creditarEstoque(qtdeCompra);
            return true;
        }
    }
}
