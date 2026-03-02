package Interview.Interview_Codes;
import java.util.*;

public class ArraysAllFunctions {
    public static void main(String[] args) {
        // Original array
        int[] arr = {5, 4, 8, 1, 2, 9, 3};
        System.out.println("Original: " + Arrays.toString(arr));  // toString()
        
        // 1. sort()
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        
        // 2. binarySearch() - must be sorted!
        System.out.println("9 found at: " + Arrays.binarySearch(arr, 9));
        
        // 3. equals()
        int[] copy = {1, 2, 3, 4, 5, 8, 9};
        System.out.println("Arrays equal: " + Arrays.equals(arr, copy));
        
        // 4. fill()
        int[] filled = new int[7];
        Arrays.fill(filled, 10);
        System.out.println("Filled: " + Arrays.toString(filled));
        
        // 5. copyOf()
        int[] bigger = Arrays.copyOf(arr, 10);
        System.out.println("CopyOf(10): " + Arrays.toString(bigger));
        
        // 6. copyOfRange()
        int[] range = Arrays.copyOfRange(arr, 2, 5);
        System.out.println("Range(2-5): " + Arrays.toString(range));
        
        // 7. asList() - for List view
        Integer[] objArr = {1, 2, 3};
        System.out.println("asList: " + Arrays.asList(objArr));
        
        // Parallel sort (multi-core)
        Integer[] parallelArr = {9, 1, 8, 2, 7};
        Arrays.parallelSort(parallelArr);
        System.out.println("ParallelSort: " + Arrays.toString(parallelArr));
        
        // Stream (Java 8+)
        Arrays.stream(arr).forEach(System.out::print);
    }
}
