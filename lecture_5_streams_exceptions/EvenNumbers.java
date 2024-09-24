import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class EvenNumbers {
    public static void main(String[] args) throws Exception {
        
        // Filter: return true if Integer is even
        Predicate<Integer> filterEvens = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Use the filter operation to extract even numbers to another list
        List<Integer> evenNumbers = numbers.stream()
            .filter(filterEvens)
            .collect(Collectors.toList()); 
        System.out.println(evenNumbers); 
    }
}
