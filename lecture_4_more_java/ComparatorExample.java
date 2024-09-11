package lecture_4_more_java;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class ComparatorExample {

    // Nested class
    private class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Compare based on the last character of the two strings
            return Character.compare(s1.charAt(s1.length() - 1), s2.charAt(s2.length() - 1));
        }
    }

    public void demo() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");

        // Sort the list using a custom comparator
        MyComparator mc = new MyComparator();
        words.sort(mc);

        // Print the sorted list
        System.out.println(words);
    }
}
