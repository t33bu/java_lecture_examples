
// Practise inheritance here

public class SmartMailbox extends Mailbox {
    // note that private members are not inherited, change to protected
    
    // note the use of superclass constructor
    public SmartMailbox(String name, String address) {        
        super(name, address);
        System.out.println("SmartMailbox constructor");
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail);
        createAlert();
    }

    public void createAlert() {
        System.out.println("Alert: You've got mail!");
    }
}
