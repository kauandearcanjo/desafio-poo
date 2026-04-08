import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Kauan de Arcanjo Menezes", 12);
        Pedido p1 = new Pedido("Pastel", 15, 2);
        Pedido p2 = new Pedido("Pastel Doce", 19, 2);
        Pedido p3 = new Pedido("Caldo de Cana", 5, 2);

        ContaRestaurante conta1 = new ContaRestaurante(cliente1, p1, p2, p3);

        conta1.exibirResumo();
    }
}