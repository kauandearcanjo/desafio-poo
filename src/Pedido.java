public class Pedido {
    String descricao;
    double valorUnitario;
    int quantidade;


    Pedido(String descricao, double valorUnitario, int quantidade){
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularTotalItem(){
        return valorUnitario * quantidade;
    }
}
