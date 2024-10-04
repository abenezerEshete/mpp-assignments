package prob3;

public class Admin {

    // Refactored method using polymorphism
    public static double computeTotalRent(Property[] properties) {
        double totalRent = 0;
        for (Property property : properties) {
            totalRent += property.computeRent();
        }
        return totalRent;
    }
}
