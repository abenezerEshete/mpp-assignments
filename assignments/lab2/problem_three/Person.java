public class Person {
    private String name;
    private Car car;

    public Person(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }
}
