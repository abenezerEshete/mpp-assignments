package Problem2.test;
import Problem2.Building;
import Problem2.Landlord;


public class Main {
    public static void main(String[] args) {
        // Create a landlord
        Landlord landlord = new Landlord();

        // Create buildings through the landlord
        Building building1 = landlord.addBuilding(1000);
        Building building2 = landlord.addBuilding(1200);

        // Add apartments to building 1
        building1.addApartment(800);
        building1.addApartment(950);
        building1.addApartment(700);

        // Add apartments to building 2
        building2.addApartment(1200);
        building2.addApartment(1300);

        // Calculate and print the total profit
        double totalProfit = landlord.calculateTotalProfit();
        System.out.println("The landlord's total monthly profit is: $" + totalProfit);
    }
}
