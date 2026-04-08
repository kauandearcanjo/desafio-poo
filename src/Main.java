import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Kauan de Arcanjo Menezes", 12);
        Pedido p1 = new Pedido("Hambúrguer ", 19, 2);
        Pedido p2 = new Pedido("Batata frita", 7.99, 1);
        Pedido p3 = new Pedido("Refrigerante", 5, 2);

        ContaRestaurante conta1 = new ContaRestaurante(cliente1, p1, p2, p3);

        conta1.exibirResumo();
    }
}