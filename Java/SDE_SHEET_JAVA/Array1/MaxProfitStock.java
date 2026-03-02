package SDE_SHEET_JAVA.Array1;

import java.util.Arrays;
import java.util.List;

// Time-Complixity: O(N) it's a Linear
public class MaxProfitStock {

    public static int printMaxProfit(List<Integer> nums)
    {
        int minElement=nums.get(0);
        int maxProfit=0;

        for(int i=0;i<nums.size();i++)
        {
            minElement=Math.min(nums.get(i),minElement);
            maxProfit=Math.max(maxProfit,(nums.get(i)-minElement));
        }

        return maxProfit;
    }
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(5,4,7,9);
        System.out.println("Largest sum is:" + printMaxProfit(nums));
    }
}
