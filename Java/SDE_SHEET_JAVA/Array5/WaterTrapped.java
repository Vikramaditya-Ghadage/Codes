package SDE_SHEET_JAVA.Array5;


import java.util.*;

public class WaterTrapped {

    public static int maxWaterTrappedBruteForce(List<Integer> nums)
    {

        int n=nums.size();
        int all_time_max=0;
        for(int i=0;i<n;i++)
        {
            int leftMax=0,rightMax=0;
            int j=i;

            while(j>=0)
            {
                leftMax=Math.max(leftMax, nums.get(j));
                j--;
            }
            j=i;

            while(j<n)
            {
                rightMax=Math.max(rightMax,nums.get(j));
                j++;
            }
            all_time_max+=(Math.min(leftMax,rightMax)-nums.get(i));
        }

        return all_time_max;
    }

    public static int maxWaterTrapped(List<Integer> nums)
    {
        int left=0,right=nums.size()-1;
        int leftMax=0,rightMax=0;

        int ans=0;
        while(left<=right)
        {
            System.out.println(left+" "+leftMax+" "+right+" "+rightMax);
            if(nums.get(left)<=nums.get(right))
            {
                if(nums.get(left)>=leftMax)
                    leftMax=nums.get(left);
                else
                    ans+=leftMax-nums.get(left);
                left++;
            }
            else
            {
                if(nums.get(right)>=rightMax)
                    rightMax=nums.get(right);
                else
                    ans+=rightMax-nums.get(right);

                right--;
            }
        }
        return ans;

    }

    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(4,0,0,3,0,0,2);
        System.out.println(maxWaterTrappedBruteForce(nums));
        System.out.println(maxWaterTrapped(nums));
    }
    
}
