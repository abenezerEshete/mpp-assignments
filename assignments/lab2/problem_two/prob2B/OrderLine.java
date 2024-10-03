package Twob;

public class OrderLine {

    private int orderLineNum;
    private double price;
    private int qty;
    private Order order;

    OrderLine(int orderLineNum, double price, int qty, Order order) {
        this.orderLineNum = orderLineNum;
        this.price = price;
        this.qty = qty;
        this.order = order;
    }

    public int getOrderLineNum() {
        return orderLineNum;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public Order getOrder() {
        return order;
    }
}



