
// Practise inheritance here
public class SmartMailbox extends Mailbox {

    // Default constructor, must call the parent class constructor
    public SmartMailbox() {        
        super();
        System.out.println("SmartMailbox default constructor");
    }

    // note the use of superclass constructor
    public SmartMailbox(String name, String address) {        
        super(name, address);
        System.out.println("SmartMailbox constructor");
    }

    // Method setMail() overridden from parent class
    // also with added functionality to create alert
    @Override
    public void setMail(String mail) {
        // Still, here its needed to call parent class method
        // to actually deliver mail
        super.setMail(mail);
        createAlert();
    }

    // Private, so only possible to create alerts internally
    private void createAlert() {
        System.out.println("Alert: You've got mail!");
    }
}
