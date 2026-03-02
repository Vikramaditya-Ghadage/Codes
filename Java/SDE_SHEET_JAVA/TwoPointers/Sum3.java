package SDE_SHEET_JAVA.TwoPointers;

import java.util.*;

public class Sum3 {

    // You Can use Two pointers only if array is sorted or order is does't matter
    private static void findThreeSum(List<Integer> nums,int target)
    {
        Collections.sort(nums);

        for(int i=0;i<nums.size();i++)
        {
            int lb=i+1,ub=nums.size()-1;

            while(lb<ub)
            {
                int sum=nums.get(i)+nums.get(lb)+nums.get(ub);
                if(sum==target)
                {
                    System.out.println(nums.get(i)+"+"+nums.get(lb)+"+"+nums.get(ub)+"="+target);
                    lb++;
                    ub--;
                }
                else if(sum>target)
                    ub--;
                else
                    lb++;
            }

        }

    }
    
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(5,4,3,2,1,6);
        int target=8;

        findThreeSum(nums,target);
    }
}
