
public class Kia implements IVehicle, ISmartCar {
    
    private final String name = "Kia";
    
    // From IVehicle
    public void start() {
        System.out.println(name + " engine starts");
    }
    public void stop() {
        System.out.println(name + " engine stops");
    }
    public void drive(String direction) {
        System.out.println(name + " drives + " + direction);
    }    
    // From ISmartCar
    public void park() {
        System.out.println(name + " is parking autonomously");
    }    
    public void navigate(String destination) {
        System.out.println(name + " is creating route to " 
            + destination);
    }    
    // Own methods
    @Override
    public String toString() {
        return "I am " + name + ", my smart version is " + version;
    }
}

