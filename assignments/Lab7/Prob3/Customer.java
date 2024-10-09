package Lab7.Prob3;

public class Customer implements CustomerInterface {

    String customerName;
    int loyaltyPoints;

    public Customer(String customerName, int loyaltyPoints) {
        this.customerName = customerName;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }


    @Override
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
}
