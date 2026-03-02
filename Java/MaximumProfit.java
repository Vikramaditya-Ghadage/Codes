import java.util.*;

public class MaximumProfit {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(10,2,5,1,9);

        int maxProfit=0;
        int minEle=Integer.MAX_VALUE;

        for(int i=0;i<nums.size();i++)
        {
            minEle=Math.min(minEle,nums.get(i));
            maxProfit=Math.max(maxProfit,(nums.get(i)-minEle));
        }

        System.out.println("Max profit:"+maxProfit);
    }
}
