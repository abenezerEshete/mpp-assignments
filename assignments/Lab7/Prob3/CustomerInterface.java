package Lab7.Prob3;

public interface CustomerInterface {

    default boolean isLoyalCustomer(int Loyaltypoints) {
        if (Loyaltypoints > 50) {
            return true;
        } else return false;
    }

    String getCustomerName();

    int getLoyaltyPoints();
}
