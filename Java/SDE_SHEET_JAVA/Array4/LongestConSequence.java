package SDE_SHEET_JAVA.Array4;

import java.util.*;

public class LongestConSequence {

    public static int printLongestConSequence(List<Integer> nums)
    {
        Set<Integer> set=new HashSet<>(nums);

        int allTimeMax=1;
        for(int no :set)
        { 
            if(!set.contains(no-1))
            {
                int currentMax=1;
                int n=no;
                while(set.contains(n+1))
                {
                    currentMax++;
                    n++;
                }
               allTimeMax=Math.max(currentMax, allTimeMax); 
            }

        }

        return allTimeMax;
    }
     public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(3, 0, 1, 0, 4, 0, 2);
        System.out.println(printLongestConSequence(nums));
    }
    
    
}
