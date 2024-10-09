package Lab7.Prob3;


public class Restaurant implements RestaurantInterface {

    private String restaurantName;
    private double baseDeliveryCharge;
    private double locationDistance;


    public Restaurant(String restaurantName, double baseDeliveryCharge, double locationDistance) {
        this.restaurantName = restaurantName;
        this.baseDeliveryCharge = baseDeliveryCharge;
        this.locationDistance = locationDistance;
    }

    @Override
    public String getRestaurantName() {
        return restaurantName;
    }


    @Override
    public double calculateDeliveryCharge() {
        return locationDistance * 0.5;
    }

    public double getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(double locationDistance) {
        this.locationDistance = locationDistance;
    }

    public double getBaseDeliveryCharge() {
        return baseDeliveryCharge;
    }
}
