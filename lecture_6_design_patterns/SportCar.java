
// Note class type could also be record!
public class SportCar implements Vehicle {
    String model;

    public SportCar(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " started");
    }

    @Override
    public void drive() {
        System.out.println(model + " driving");
    }

    @Override
    public void stop() {
        System.out.println(model + " stopped");
    }

}
