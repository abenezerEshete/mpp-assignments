/*
1. Create an Example:
We can create an example where a Person can optionally own One Car.
The person may or may not have a car, but a car cannot exist without being owned by a person.
 This is a one-to-zero..one unidirectional association.

2. Diagram:
The association would be drawn as follows:

Person (1) ----------------------> (0..1) Car

In this case:
Person is the owning entity.
Car is the optional entity associated with a person.
The arrow indicates that the relationship is unidirectional from Person to Car,
meaning that Person knows about Car, but Car does not know about Person.

*/

public class Main {
    public static void main(String[] args) {
        // Create a person
        Person person = new Person("Alice");

        // Create a car and associate it with the person
        Car car = new Car("Toyota Corolla");
        person.setCar(car);

        // Print person and their car
        System.out.println(person.getName() + " owns a " + person.getCar().getModel());

        // Optionally, test without a car
        Person personWithoutCar = new Person("Bob");
        System.out.println(personWithoutCar.getName() + " has no car.");
    }
}