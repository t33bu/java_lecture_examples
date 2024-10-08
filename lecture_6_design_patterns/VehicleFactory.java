public class VehicleFactory {

    // private constructor!
    private VehicleFactory() {}

    // static method to create new instances
    static Vehicle produce(String type) {
        switch(type) {
            case "sport":
                return new SportCar("Porsche 911");
            case "sedan":
                return new SedanCar("Toyota Camry");
        };
        return null;
    }
}

