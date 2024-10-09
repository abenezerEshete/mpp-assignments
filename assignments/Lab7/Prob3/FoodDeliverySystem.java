package Lab7.Prob3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FoodDeliverySystem {

    public static void main(String[] args) {
// Create an ArrayList of Restaurants
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
        restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
        restaurants.add(new Restaurant("Burger World", 4.0, 7.5));

// Create an ArrayList of Customers

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", 60));
        customers.add(new Customer("Jane Smith", 40));
        customers.add(new Customer("Bob Johnson", 80));
// Print welcome message
        System.out.println("Welcome to the Food Delivery System!");
        /* Complete the part */

        // Map to hold customer locations (dynamic retrieval)
        Map<String, Double> customerLocations = new HashMap<>();
        customerLocations.put("John Doe", 12.0);  // Example locations
        customerLocations.put("Jane Smith", 6.0);
        customerLocations.put("Bob Johnson", 8.0);

        Random random = new Random();
        //print results of each restaurant

        for (Restaurant restaurant : restaurants) {
            for (Customer customer : customers) {
                // Random order amount between $50 and $200
                double orderAmount = 50 + (150 * random.nextDouble());
                double randomDistance = 1.0 + (19.0 * random.nextDouble());

                // Fetching customer location from the map
                double customerLocation = customerLocations.get(customer.getCustomerName());

                // Set the distance for the restaurant
                restaurant.setLocationDistance(customerLocation);

                // Calculate the delivery charge using the set distance
                double deliveryCharge = restaurant.calculateDeliveryCharge();

                // Check if the customer is loyal
                boolean isLoyal = customer.isLoyalCustomer(customer.getLoyaltyPoints());
                String loyaltyStatus = isLoyal ? "Loyal Customer" : "New Customer";

                // Calculate discount
                double discount = restaurant.calculateDiscount(orderAmount);
                double totalAfterDiscount = orderAmount - discount;

                // Print customer status
                System.out.println("Processing order for Customer: " + customer.getCustomerName() + " at Restaurant: " + restaurant.getRestaurantName());
                System.out.println("Customer Loyalty Status: " + loyaltyStatus);

                // Use the static method to print formatted order details
                RestaurantInterface.printFormattedString(
                        restaurant.getRestaurantName(),
                        customer.getCustomerName(),
                        orderAmount,
                        deliveryCharge,
                        discount,
                        totalAfterDiscount
                );

            }
        }
    }
}

