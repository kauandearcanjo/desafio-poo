public class ContaRestaurante {
    Cliente cliente;
    Pedido pedido1;
    Pedido pedido2;
    Pedido pedido3;

    ContaRestaurante(Cliente cliente, Pedido pedido1, Pedido pedido2, Pedido pedido3){
        this.cliente = cliente;
        this.pedido1 = pedido1;
        this.pedido2 = pedido2;
        this.pedido3 = pedido3;
    }

    public double calcularSubtotal() {
        return pedido1.calcularTotalItem() +
                pedido2.calcularTotalItem() +
                pedido3.calcularTotalItem();
    }

    public double calcularTaxaServico(){
        double subtotal = calcularSubtotal();
        if(subtotal > 100){
            return subtotal * 0.10;
        } else {
            return subtotal * 0.05;
        }
    }


    public double calcularValorDoDesconto(){
        if(cliente.primeiraLetra().equalsIgnoreCase("A")) {
            return calcularSubtotal() * 0.15;
        }
        return 0;
    }

    public double calcularValorFinal() {
        double subtotal = calcularSubtotal();
        double taxa = calcularTaxaServico();
        double desconto = calcularValorDoDesconto();

        return (subtotal + taxa) - desconto;
    }
}