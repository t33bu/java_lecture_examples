package lecture_3_java_collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public void demo() {
        
        // Create a list of String objects
        List<String> letters = Arrays.asList("A", "B", "C", "D", "E");
        System.out.println("How many letters? " + letters.size());

        // Get and use iterator for the list
        Iterator<String> it = letters.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

        // Internally uses iterator
        for (String s : letters) {
            System.out.print(s);
        }
        System.out.println();

        // Functional programming..
        // it = letters.iterator();
        // it.forEachRemaining(s -> System.out.print(s));
    }
}
