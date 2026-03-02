package SDE_SHEET_JAVA.Array2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.*;
// we can use formula as sum=n*(n+1)/2;
public class RepeatAndMissing {

    public static void findReapeatAndMissingElement(List<Integer> nums)
    {
        Map<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<nums.size();i++)
        {
            if(map.containsKey(nums.get(i)))
            {
                System.out.println("Reapeated No Found:"+nums.get(i));
            }
            else
            {
                map.put(nums.get(i),i);
            }

        }

        System.out.println(map);
        for(int no=1;no<=nums.size();no++)
        {
            if(!map.containsKey(no))
            {
               System.out.println("Missing No Found:"+no); 
            }
        }
    }
    public static void main(String[] args) {
    
      List<Integer> nums=Arrays.asList(5,4,1,2,6,2);
      findReapeatAndMissingElement(nums);
    }
}
