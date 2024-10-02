package Twob;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private String name;
    private LocalDate date;
    private List<OrderLine> orderLines;

    // Constructor
    public Order(String name, LocalDate date, OrderLine firstOrderLine) {
        this.name = name;
        this.date = date;
        this.orderLines = new ArrayList<>();
        addOrderLine(firstOrderLine); // Add the initial order line
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines; // Returns the list of order lines
    }
}




