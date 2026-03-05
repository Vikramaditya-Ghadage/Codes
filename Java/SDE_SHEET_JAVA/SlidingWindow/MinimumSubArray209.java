package SDE_SHEET_JAVA.SlidingWindow;
public class MinimumSubArray209
{
     public static int minSubArrayLen(int[] nums,int target) {
        int currentSum=0;
        int minLen=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            currentSum+=nums[right];
            while(currentSum>=target)
            {
                minLen=Math.min(minLen,right-left+1);
                currentSum-=nums[left];
                left++;
            }
        }

        return minLen==Integer.MAX_VALUE?0:minLen;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        System.out.println(minSubArrayLen(nums,10));
    }
}