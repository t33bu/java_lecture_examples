// abstract class
public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // abstract method
    public abstract void drive(String direction);
}

