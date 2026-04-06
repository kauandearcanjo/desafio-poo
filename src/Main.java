import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Cliente cliente1 = new Cliente("Kauan de Arcanjo", 10);
        Pedido pedido1 = new Pedido("Arroz", 10, 2);

        System.out.println(cliente1.getNomeCompleto());
        System.out.println(cliente1.nomeMaiusculo());
        System.out.println(pedido1.calcularTotalItem());
    }
}