package Problem2;
import java.util.List;
import java.util.ArrayList;

public class Landlord {
    private List<Building> buildings;

    public Landlord() {
        this.buildings = new ArrayList<>();
    }

    // Factory method to create a building
    public Building addBuilding(double maintenanceCost) {
        Building building = new Building(maintenanceCost);
        buildings.add(building);
        return building;
    }

    public double calculateTotalProfit() {
        double totalProfit = 0.0;
        for (Building building : buildings) {
            totalProfit += building.calculateProfit();
        }
        return totalProfit;
    }
}




