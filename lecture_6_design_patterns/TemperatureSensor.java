
// non-sealed: sealed superclass requires similar declaration
public non-sealed class TemperatureSensor extends SensorTemplate {

    @Override
    public void initialize() {
        // Using getclass just for fun
        System.out.println("TemperatureSensor initialized");
    }

    @Override
    public void startMeasure() {
        System.out.println("TemperatureSensor starting measurement");
    }

    @Override
    public void stopMeasure() {
        System.out.println("TemperatureSensor measurement done");
    }

    @Override
    public Integer getData() {
        // just some "data"
        return 25;
    }
}
