
// non-sealed: sealed superclass requires similar declaration
public non-sealed class HumiditySensor extends SensorTemplate {

    @Override
    public void initialize() {
        // Using getclass just for fun        
        System.out.println("HumiditySensor initialized");
    }

    @Override
    public void startMeasure() {
        System.out.println("HumiditySensor starting measurement");
    }

    @Override
    public void stopMeasure() {
        System.out.println("HumiditySensor measurement done");
    }

    @Override
    public Integer getData() {
        // just some "data"        
        return 44;
    } 
}

