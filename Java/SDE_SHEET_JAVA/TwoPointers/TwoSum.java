package SDE_SHEET_JAVA.TwoPointers;

import java.util.*;
public class TwoSum
{
    // You Can use Two pointers only if array is sorted or order is does't matter
    private static void findTwoSum(List<Integer> nums,int target)
    {
        int lb=0,ub=nums.size()-1;

        while(lb<ub)
        {
            int sum=nums.get(lb)+nums.get(ub);
            if(sum==target)
            {
                System.out.println(nums.get(lb)+"+"+nums.get(ub)+"="+target);
                lb++;
                ub--;
            }
            else if(sum>target)
                ub--;
            else
                lb++;
        }
    }
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        int target=5;

        findTwoSum(nums,target);
        
    }
}