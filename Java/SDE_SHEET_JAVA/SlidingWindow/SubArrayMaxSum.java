package SDE_SHEET_JAVA.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubArrayMaxSum {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,9,5,4,8,7,6);
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=3;
        int left=0,right=0;
        int maxSum=0;
        int winSum=0;

        for(right=0;right<nums.size();right++)
        {
            map.put(nums.get(right),map.getOrDefault(nums.get(right), 0)+1);
            winSum+=nums.get(right);

            // // To check Duplicate
            // if(map.get(nums.get(right))>1)
            // {
            //     map.put(nums.get(left),map.getOrDefault(nums.get(left),0 )-1);
            //     winSum-=nums.get(left);
            //     left++;
            // }
            System.out.println("left:"+left +"  Right:"+right+" WinSUm:"+winSum+"  ->"+map);
            if(right-left+1==k)
            {
                maxSum=Math.max(maxSum, winSum);
                winSum-=nums.get(left);
                left++;
            }

            
        }
        System.out.println("maximum sum:"+maxSum);
    }
}
