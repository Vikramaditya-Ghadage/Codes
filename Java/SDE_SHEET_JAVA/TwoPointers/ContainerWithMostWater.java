package SDE_SHEET_JAVA.TwoPointers;

import java.util.Arrays;
import java.util.List;

public class ContainerWithMostWater {

    public static int findMostWater(List<Integer> nums)
    {
        int maxArea=0;
        int lb=0,ub=nums.size()-1;

        while(lb<ub)
        {   
            int currentArea=Math.min(nums.get(lb),nums.get(ub))*(ub-lb);
            
            maxArea=Math.max(maxArea,currentArea);

            if(nums.get(lb)<nums.get(ub))
            {
                lb++;
            }
            else
            {
                ub--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,1);

        System.out.println("Most Water:"+findMostWater(nums));
    }
    
}
