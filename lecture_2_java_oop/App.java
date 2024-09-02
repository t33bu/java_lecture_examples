public class App {
    public static void main(String[] args) throws Exception {

        SmartMailbox mailbox = new SmartMailbox("Teemu", "Street 1");

        mailbox.setMail("Hello");
        String myMail = mailbox.getMail();
        System.out.println(mailbox.name + " received mail: " + myMail);

        mailbox.setBill(100);
        System.out.println(mailbox.name + " received bill for " + mailbox.getBill());

        // 1. change to visibility private, for a good reason..
        // 2. add bill, getter and setter and overload
        // 3. add class Mail and override toString
        // 4. add class Postman to deliver Mail
        // 5. add method to check if address match, then deliver

        // 6. create class SmartMailbox
        // 7. create alert method
        // 8. override setmail to create alert
        
    }
}
