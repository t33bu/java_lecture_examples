public class Ford extends Vehicle{

    private String model;

    public Ford(String model) {
        super("Ford");
        this.model = model;
    }

    // Note: annotation override not necessary,
    // since its a must to have implementation
    public void drive(String direction) {
        System.out.println(name + " " + model + " drives " + direction);        
    } 
}

