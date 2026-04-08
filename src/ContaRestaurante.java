public class ContaRestaurante {
    Cliente cliente;
    Pedido pedido1;
    Pedido pedido2;
    Pedido pedido3;

    ContaRestaurante(Cliente cliente, Pedido pedido1, Pedido pedido2, Pedido pedido3) {
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

    public double calcularTaxaServico() {
        double subtotal = calcularSubtotal();
        if (subtotal > 100) {
            return subtotal * 0.10;
        } else {
            return subtotal * 0.05;
        }
    }


    public double calcularValorDoDesconto() {
        if (cliente.primeiraLetra().equalsIgnoreCase("A")) {
            return 15;
        }
        return 0;
    }

    public double calcularValorFinal() {
        double subtotal = calcularSubtotal();
        double taxa = calcularTaxaServico();
        double desconto = calcularValorDoDesconto();

        return (subtotal + taxa) - desconto;
    }

    public void exibirResumo() {
        Pedido[] pedidos = {pedido1, pedido2, pedido3};

        // Informações do Cliente
        System.out.println("Cliente: " + cliente.nomeMaiusculo());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Mesa: " + cliente.mesa);
        System.out.println("\nPedidos:");

        // Laço para os pedidos
        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf("%d - %s | Qtd: %d | Total: R$ %.2f%n",
                    (i + 1),
                    pedidos[i].descricao,
                    pedidos[i].quantidade,
                    pedidos[i].calcularTotalItem()
            );
        }

        // Resumo financeiro
        System.out.println("\n--------------------------");
        System.out.printf("Subtotal: R$ %.2f%n", calcularSubtotal());
        System.out.printf("Taxa de serviço: R$ %.2f%n", calcularTaxaServico());
        System.out.printf("Desconto: R$ %.2f%n", calcularValorDoDesconto());
        System.out.printf("Valor final: R$ %.2f%n", calcularValorFinal());
    }
}
