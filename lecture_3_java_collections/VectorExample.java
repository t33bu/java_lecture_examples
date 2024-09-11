package lecture_3_java_collections;

import java.util.Vector;

public class VectorExample {
    public void demo() {

        Vector<String> fruits = new Vector<>();
        
        // Add elements to the vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Insert an element at a specific index
        fruits.add(1, "Orange");
        
        // Remove an element from the vector
        fruits.remove("Banana");

        System.out.println(fruits);
    }
}
