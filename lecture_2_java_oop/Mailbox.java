public class Mailbox {
    private String name;
    private String address;
    private String mail;
    private Double bill;

    // Default constructor
    public Mailbox() {  
        System.out.println("Mailbox default constructor");
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
    public String getName() {
        return name;
    }
    // protected so controlled who can set name
    protected void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    // protected so controlled who can set address
    public void setAddress(String address) {
        this.address = address;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    // protected so controlled who can get mail
    protected String getMail() {
        return mail;
    }
    // first version of setBill()
    public void setBill(Double bill) {
        this.bill = bill;
    }
    // second version, overloaded setBill() with Integer parameter
    public void setBill(Integer bill) {
        this.bill = bill.doubleValue(); // convert to Double using doubleValue()
    }
    public Double getBill() {
        return bill;
    }
}


