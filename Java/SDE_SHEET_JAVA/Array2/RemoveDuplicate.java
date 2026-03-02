package SDE_SHEET_JAVA.Array2;

import java.util.*;
public class RemoveDuplicate {

        public static void removeDuplicates(List<Integer> nums)
        {
            LinkedHashSet<Integer> set=new LinkedHashSet<>(nums);
            nums.clear();
            nums.addAll(set);

        }

        public static void main(String[] args) {
        
        // Direct Arrays.asList(...) returns a fixed‑size list, 
        // and calling clear() (or remove) on it throws UnsupportedOperationException.
        List<Integer> nums= new ArrayList<>(
            Arrays.asList(2,4,3,2,4,5,7,8,7)
        );   //  
   

        removeDuplicates(nums);

        System.out.println(nums);
    }
}
