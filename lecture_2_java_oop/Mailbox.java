public class Mailbox {
    public String name;
    public String address;
    private String mail;
    private Double bill;

    // Default constructor
    public Mailbox() {
        this.name = "Someone";
        this.address = "Street 0";
    }

    // Constructor
    public Mailbox(String name, String address) {      
        System.out.println("Mailbox constructor");
        this.name = name;
        this.address = address; 
        // this.name refers to the class member 
        // name refers to the method parameter
    }

    // Getters and setters
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }
    public void setBill(Double bill) {
        this.bill = bill;
    }
    // Another overloaded setBill, with Integer parameter
    public void setBill(Integer bill) {
        // Convert Integer to Double with method doubleValue()
        this.bill = bill.doubleValue();
    }
    public Double getBill() {
        return bill;
    }
}


