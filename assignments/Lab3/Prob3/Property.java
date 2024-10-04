package prob3;

public abstract class Property {
    private Address address;

    public Property(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // Abstract method to be implemented by subclasses
    public abstract double computeRent();
}

