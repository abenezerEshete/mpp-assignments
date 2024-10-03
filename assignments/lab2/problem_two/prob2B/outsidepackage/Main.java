package prob2B.outsidepackage;//package Twob.outsidepackage

import java.time.LocalDate;
import Twob.Order;
import Twob.OrderLine;
import Twob.OrderAndOrderLine;


public class Main {
        public static void main(String[] args) {
            OrderAndOrderLine orderManager = new OrderAndOrderLine();

            // Create an Order
            Order order = orderManager.createOrder("Order01", LocalDate.now());

            // Create additional OrderLines
            orderManager.createOrderLine(2, 10.49, 1, order);
            orderManager.createOrderLine(3, 5.09, 5, order);
            orderManager.createOrderLine(4, 15.00, 2, order);
            orderManager.createOrderLine(5, 8.99, 3, order);

            // Display all orders and their lines
            orderManager.displayOrders();
        }
    }

//        OrderAndOrderLine orderManager = new OrderAndOrderLine();
//
//        // Create an Order
//        Order order = orderManager.createOrder("Order01", LocalDate.now());
//
//        // Create additional OrderLines
//        orderManager.createOrderLine(2, 10.49, 1, order);
//        orderManager.createOrderLine(3, 5.09, 5, order);
//        orderManager.createOrderLine(4, 15.00, 2, order);
//        orderManager.createOrderLine(5, 8.99, 3, order);
//
//        // Display all orders and their lines
//        orderManager.displayOrders();
//    }
   // }
//}


