
import java.util.*;

public class ListOperations {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        int n=list.size();
        
        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
        
        Collections.reverse(list);
        Collections.reverse(list.subList(2,n));    // Reverse all the elements from perticuler brackets

        Collections.swap(list, 0, n-1);
        
        Collections.rotate(list, 2);        // Left Rotate
        Collections.rotate(list, -2);       // Right Rotate
        
        System.out.println("Min element:"+Collections.min(list));
        System.out.println("Max element:"+Collections.max(list));
        
        System.out.println("Frequency of element:"+Collections.frequency(list, 10));
        list.forEach(System.out::println);
        
    }
}
