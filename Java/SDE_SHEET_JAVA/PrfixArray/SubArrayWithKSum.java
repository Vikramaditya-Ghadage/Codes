package SDE_SHEET_JAVA.PrfixArray;

import java.util.*;

public class SubArrayWithKSum {

    public static int findLengthOfLargestSubArrayWithKSum(List<Integer> nums,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int currentSum=Integer.MIN_VALUE;
        int maxLen=0;  
        
        map.put(0, -1);  // handle prefix

        for(int i=0;i<nums.size();i++)
        {
            int currLen=0;

            currentSum+=nums.get(i);
                
            if(map.containsKey(currentSum-k))
                currLen=(i-map.get(currentSum-k));

            map.put(currentSum,i);

            maxLen=Math.max(maxLen,currLen);
        }

        return maxLen;
    }

    // Same logic that we applied on 2-sum
    public static int findCntOfSubArrayWithKSum(List<Integer> nums,int k)
    {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int currentSum=0;
        map.put(0, 1); // Hendle Prefix conditions

        for(int i=0;i<nums.size();i++)
        {
            currentSum+=nums.get(i);

            if(map.containsKey(currentSum-k))
                res+=map.getOrDefault(map,0 )+1;

            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }

        return res;
    }

    // O(N^2)
    public static int findSumWithKSumBruteForce(List<Integer> nums,int k)
    {
        int res=0;
        int n=nums.size();
        List<Integer> prefix=new ArrayList<>();
        prefix.add(nums.get(0));
        for(int i=1;i<nums.size();i++)
        {
            prefix.add(nums.get(i)+prefix.get(i-1));
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
                if(k==(prefix.get(j)-prefix.get(i)))
                    res++;
        }

        System.out.println(prefix);
        return res;   
    }
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,1,1,2,2,3,4,5,6,7,8);
        
       // System.out.println("Total count is:"+findSumWithKSumBruteForce(nums,7));

        System.out.println("Total Subarray count with K Sum is:"+findCntOfSubArrayWithKSum(nums,7));

        System.out.println("Largest Subarray with K Sum is:"+ findLengthOfLargestSubArrayWithKSum(nums,7));
        
    }
    
}
