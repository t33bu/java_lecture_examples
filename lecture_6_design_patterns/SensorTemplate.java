
// sealed: only permitted classes can inherit
// permits: these are the permitted classes
abstract sealed class SensorTemplate 
    permits TemperatureSensor, HumiditySensor {

    abstract void initialize();
    abstract void startMeasure();
    abstract void stopMeasure();
    abstract Integer getData();

    // enforce the steps for using sensor
    // in programs
    final void activate() {
        initialize();
        startMeasure();
        stopMeasure();
    }
}

