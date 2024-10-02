package Twob;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderAndOrderLine {

    private List<Order> orders;

    public OrderAndOrderLine() {
        this.orders = new ArrayList<>();
    }

    public Order createOrder(String name, LocalDate date, OrderLine firstOrderLine) {
        Order order = new Order(name, date, firstOrderLine);
        orders.add(order);
        return order;
    }

    public OrderLine createOrderLine(int orderLineNum, double price, int qty, Order order) {
        OrderLine orderLine = new OrderLine(orderLineNum, price, qty, order); // Create a new order line
        order.addOrderLine(orderLine);
        return orderLine;
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println("Order Name: " + order.getName() + ", Date: " + order.getDate());
            System.out.println("Order Lines:");
            for (OrderLine orderLine : order.getOrderLines()) {
                System.out.printf(" - Order Line Number: %d, Price: %.2f, Quantity: %d%n",
                        orderLine.getOrderLineNum(), orderLine.getPrice(), orderLine.getQty());
            }
        }
    }
}


