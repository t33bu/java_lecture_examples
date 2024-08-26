
import java.util.Scanner;

public class ConsoleInput {
    public void demo() {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, I'm a time-traveler. What year is it? ");
        Integer year = keyboard.nextInt(); 
        System.out.println("Ok, so the year is " + year);
        keyboard.close();
    }
}
