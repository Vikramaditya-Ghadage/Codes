package fixed;


import java.util.*;

public class MaxSumSubArrayWithKSize {

    public static void maxSubArray(List<Integer> nums,int k)
    {
        long maxSum=Integer.MIN_VALUE;
        long winSum=0;
        int lb=0;
        for(int ub=0;ub<nums.size();ub++)
        {
            
            winSum+=nums.get(ub);

            // map.put(nums.get(right),map.getOrDefault(nums.get(right), 0)+1);

            // // To check Duplicate
            // if(map.get(nums.get(right))>1)
            // {
            //     map.put(nums.get(left),map.getOrDefault(nums.get(left),0 )-1);
            //     winSum-=nums.get(left);
            //     left++;
            // } 

            if(ub-lb+1==k)
            {
                System.out.println(winSum);
                maxSum=Math.max(maxSum,winSum);
                winSum-=nums.get(lb);
                lb++;
            }

        }

        System.out.println("Max Sum from subarray with k size:"+maxSum);

    }
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,9,-5,4,-8,7,6);
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=3;
        // int left=0,right=0;
        // int maxSum=0;
        // int winSum=0;

        // for(right=0;right<nums.size();right++)
        // {
        //     map.put(nums.get(right),map.getOrDefault(nums.get(right), 0)+1);
        //     winSum+=nums.get(right);


        //     System.out.println("left:"+left +"  Right:"+right+" WinSUm:"+winSum+"  ->"+map);
        //     if(right-left+1==k)
        //     {
        //         maxSum=Math.max(maxSum, winSum);
        //         winSum-=nums.get(left);
        //         left++;
        //     }
            
        // }
        // System.out.println("maximum sum:"+maxSum);


        maxSubArray(nums,k);
    }
}
