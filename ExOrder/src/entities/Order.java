package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities.enums.OrderStatus;

public class Order {
    
    OrderItem orderItem = new OrderItem();
    private Date moment = new Date();
    private OrderStatus status;
    
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();
    
    public Order() {
    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    } 
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<OrderItem> getOrderItem() {
        return orderItems;
    }
    
    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Double total(){
        Double y = 0.0;
        for (OrderItem x: orderItems) {
            y += x.subTotal();
        }
        return y;
    }
}
