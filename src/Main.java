import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("vna", 10);
        Pedido p1 = new Pedido("Arroz", 10, 2);
        Pedido p2 = new Pedido("Feijao", 15, 2);
        Pedido p3 = new Pedido("Carne", 20, 3);

        ContaRestaurante conta1 = new ContaRestaurante(cliente1, p1, p2, p3);


//        double subtotal = conta1.calcularSubtotal();
//        System.out.println("Cliente: " + cliente1.getPrimeiroNome());
//        System.out.println("Subtotal da conta: R$ " + subtotal);
//        System.out.println("A taxa de serviço é: "+conta1.calcularTaxaServico());

        System.out.println(conta1.calcularValorFinal());
    }
}