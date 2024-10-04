package Problem2;
import java.util.List;
import java.util.ArrayList;

public class Building {
    private List<Apartment> apartments;
    private double maintenanceCost;

    // Private constructor, can only be called by Landlord
    Building(double maintenanceCost) {
        this.apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;
    }

    // Factory method to create an apartment
    public void addApartment(double rent) {
        Apartment apartment = new Apartment(rent);
        apartments.add(apartment);
    }

    public double calculateProfit() {
        double totalRent = 0.0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }
}

