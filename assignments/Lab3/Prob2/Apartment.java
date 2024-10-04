package Problem2;

public class Apartment {
    private double rent;

    // Private constructor, can only be called by Building
    Apartment(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }
}


