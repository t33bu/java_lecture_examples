package lecture_3_java_collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public void demo() {

        List<Character> list = new ArrayList<>();
        list.add('G');
        list.add('F');
        list.add('D');
        list.add('I');
        list.add('S');

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse sorted list: " + list);        
    }
}
