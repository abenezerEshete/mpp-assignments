package Lab7.Prob3;


public interface RestaurantInterface {

    String getRestaurantName();

    double calculateDeliveryCharge();

    static void printFormattedString(String restaurantName, String customerName, double orderAmount,
                                     double deliveryCharge, double discount, double totalAfterDiscount) {
        System.out.printf("Restaurant: %s\nCustomer: %s\nOrder Amount: $%.2f\nDelivery Charge: $%.2f\nDiscount Applied: $%.2f\nTotal After Discount: $%.2f\n\n",
                restaurantName, customerName, orderAmount, deliveryCharge, discount, totalAfterDiscount);
    }


    default double calculateDiscount(double totalOrderOfAmount) {
        if (totalOrderOfAmount > 100) {
            return 0.05 * totalOrderOfAmount;
        } else return 0;
    }


}

