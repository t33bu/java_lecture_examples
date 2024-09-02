public class App {
    public static void main(String[] args) throws Exception {

        // First try with class Mailbox
        Mailbox mailbox = new Mailbox("Teemu", "Street 1");
        // Second try with class SmartMailbox
        // SmartMailbox mailbox = new SmartMailbox("Teemu", "Street 1");

        mailbox.setBill(100); // Note uses overloaded method
        System.out.println(mailbox.getName() + " received bill for " + mailbox.getBill());

        mailbox.setMail("Tomatoes on sale!");
        String myMail = mailbox.getMail();
        System.out.println(mailbox.getName() + " received mail: " + myMail);
    }
}
