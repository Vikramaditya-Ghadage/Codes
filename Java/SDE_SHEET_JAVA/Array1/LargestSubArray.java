package SDE_SHEET_JAVA.Array1;

import java.util.Arrays;
import java.util.List;

// Time-Complixity: O(N) it's a Linear
public class LargestSubArray {
    
    public static int printLargestSubArray(List<Integer> nums)
    {
        int allTimeMax=nums.get(0);
        int currentMax=nums.get(0);

        for(int i=1;i<nums.size();i++)
        {
            currentMax=Math.max(nums.get(i),(nums.get(i)+currentMax));
            System.out.println(currentMax);
            allTimeMax=Math.max(allTimeMax,currentMax);
        }

        return allTimeMax;
    }

    public static int findMaxSum(List<Integer> nums)
    {
        int allTimeMax=nums.get(0);
        int currentMax=nums.get(0);

        for(int i=1;i<nums.size();i++)
        {
            if(currentMax<0)
            {
                currentMax=nums.get(i);
            }
            else
            currentMax=currentMax+nums.get(i);
            
            allTimeMax=Math.max(allTimeMax,currentMax);
        }

        return allTimeMax;
    }
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(-2, -2, -4, -1, -11, -1, -8, -3);
        System.out.println("Largest sum is:" + printLargestSubArray(nums));

        //System.out.println("Largest sum is:" + findMaxSum(nums));
    }
    
}
