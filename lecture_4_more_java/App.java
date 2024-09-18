public class App {

    // keyword final used to declare constants
    final private String dateOfBirth = "Jan-01-2000";

    // change to static to make example work
    String name;

    // change to static to make example work
    void myMethod() {
        System.out.println("Here in myMethod");
    }

    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, " + name);
        // myMethod();

        // As an example, Math class has a lot of static operations available
        // System.out.println("Java thinks the value of pi is " + Math.PI);

        /* 
        // Method access through class
        Student.setSchool("OAMK");

        Student alice = new Student("Alice");        
        Student bob = new Student("Bob");

        System.out.println(alice); // toString() called automatically
        System.out.println(bob);   
        
        // Now change the value of static variable
        Student.setSchool("OUAS");

        System.out.println(alice); 
        System.out.println(bob);   
        */

        /* 
        // Abstract class example
        Ford f = new Ford("Sierra");
        f.drive("North");
        */
        /* 
        Kia k = new Kia();
        System.out.println(k);
        */
    }
}
