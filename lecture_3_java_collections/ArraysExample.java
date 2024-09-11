package lecture_3_java_collections;

import java.util.Arrays;

public class ArraysExample {
    public void demo() { 

        // Do not use primitive data types
        Integer[] numbers = { 0,5,2,4,3,1 };

        System.out.println("Unsorted: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        Integer key = 2;
        Integer idx = Arrays.binarySearch(numbers, key);
        System.out.println(key + " can be found at index " + idx);
        
        Integer[] copy = Arrays.copyOfRange(numbers,1,4);        
        System.out.println("Copy a part of an array: " + Arrays.toString(copy));

        Arrays.fill(numbers, 3);
        System.out.println("Filled array: " + Arrays.toString(numbers));        
    }
}


