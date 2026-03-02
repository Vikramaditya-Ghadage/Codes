import java.util.*;

public class ExecuterDemo {
    public static void main(String[] args) {

        List<Integer> nums=Arrays.asList(1,5,4,2,9,9,9);
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=4;
        int left=0,right=0;
        int maxSum=0;
        int winSum=0;

        for(right=0;right<nums.size();right++)
        {
            map.put(nums.get(right),map.getOrDefault(nums.get(right), 0)+1);
            winSum+=nums.get(right);

            if(map.get(nums.get(right))>1)
            {
                map.put(nums.get(left),map.getOrDefault(nums.get(left),0 )-1);
                winSum-=nums.get(left);
                left++;
            }
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
