package SDE_SHEET_JAVA.Array4;

import java.util.*;

public class Sum2 {

    public static void printSum(List<Integer> nums,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.size();i++)
        {
            int no=nums.get(i);
            map.put(no,i);
            if(map.containsKey(target-no))
            {
                System.out.println("Found:"+no+"+"+(target-no)+"="+target);
            }
        }
    }
    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7);
        int target=6;
        printSum(nums,target);
    }
    
}
