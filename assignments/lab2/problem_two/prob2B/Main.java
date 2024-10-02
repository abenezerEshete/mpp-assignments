package Twob;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        OrderAndOrderLine orderManager = new OrderAndOrderLine();

        OrderLine firstOrderLine = new OrderLine(1, 29.99, 2, null); // Placeholder for the order reference

        Order order = orderManager.createOrder("Order01", LocalDate.now(), firstOrderLine);

        // Set the order reference
       firstOrderLine = new OrderLine(1, 29.99, 2, order);
        order.addOrderLine(firstOrderLine);


        orderManager.createOrderLine(2, 10.49, 1, order);
        orderManager.createOrderLine(3, 5.09, 5, order);


        orderManager.displayOrders();
    }
}


