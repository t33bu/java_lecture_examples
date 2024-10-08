public class VehicleAdapter implements Vehicle {
    private Bike myBike;
    
    public VehicleAdapter(Bike bike) {
        this.myBike = bike;
    }

    @Override
    public void start() {
        System.out.println("For bike, start does nothing");
    }

    @Override
    public void drive() {
        myBike.pedal();
    }

    @Override
    public void stop() {
        System.out.println("For bike, stop does nothing");
    }   
}

