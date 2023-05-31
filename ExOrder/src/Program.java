import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Order order = new Order();
 
        System.out.println("Entre com os dados do cliente:");
        System.out.println("Nome:");
        String name = sc.next();
        System.out.println("Email:");
        String email = sc.next();
        System.out.println("Aniversário:");
        Date birthDate = sdf.parse(sc.next());
        System.out.println("Entre com os dados do pedido:");
        System.out.println("Status:");
        String status = sc.next();
        Order orderX = new Order(order.getMoment(), OrderStatus.valueOf(status),new Client(name, email, birthDate));

        System.out.println("Qual o número de pedidos?");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Entre com os dados do pedido "+ i);
            System.out.println("Nome:");
            String ItemName = sc.next();
            System.out.println("Preço:");
            Double price = sc.nextDouble();
            System.out.println("Quantidade:");
            Integer quantity = sc.nextInt();
            
            OrderItem orderItems = new OrderItem(quantity, price, new Product(ItemName, price));
            orderX.addOrderItem(orderItems);
             //orderX.total();
        }

        System.out.println("Sumário da ordem:");
        System.out.println("Momento da ordem: " + sdf2.format(orderX.getMoment()));
        System.out.println("Status da ordem: " + orderX.getStatus());
        System.out.println("Cliente: "+ orderX.getClient());
        System.out.println("Items da ordem:");
        for (OrderItem x: orderX.getOrderItem()){
            System.out.println(x);
        }
        System.out.println();
        System.out.println("Preço total: R$"+ orderX.total());
        sc.close();
    }
}
