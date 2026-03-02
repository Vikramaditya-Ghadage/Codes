package SDE_SHEET_JAVA.PrfixArray;

import java.util.HashMap;

// Maximum length of a contiguous subarray with an equal number of 0 and 1.
public class ContinousBineryArray {

     public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);  // to handle base condition of [0,1]
        int currentSum=0;
        int maxLen=0;

        for(int i=0;i<nums.length;i++)
        {

            currentSum+=(nums[i]==0?-1:1);

            if(map.containsKey(currentSum))
            {
                maxLen=Math.max(maxLen,(i-map.get(currentSum)));
            }
            else
            {
                map.put(currentSum,i);
            }
        }
        return maxLen;
        
    }

    public static void main(String[] args) {
        
        //int []nums={0,1};
        int []nums={0,1,1,1,1,1,0,0,0};
        System.out.println("Max Length:"+findMaxLength(nums));
    }
    
}
