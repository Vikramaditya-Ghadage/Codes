package SDE_SHEET_JAVA.Array1;

import java.util.*;

public class NextPermutation {

    public static void findNextPermutation(List<Integer> nums)
    {
        int n=nums.size();
        int k,ub;

        for(k=n-2;k>=0;k--)
        {
            if(nums.get(k)<nums.get(k+1))
                break;
        }

        if(k<0)
            Collections.reverse(nums);
        for(ub=n-1;ub>k;ub--)
        {
            if(nums.get(k)<nums.get(ub))
                break;
        }
        Collections.swap(nums, k, ub);
        Collections.reverse(nums.subList(k+1, n));

    }
    public static void main(String[] args) {
        
        List<Integer> nums=Arrays.asList(3,1,5,2,6,4);
        findNextPermutation(nums);
        System.out.println(nums);
    }
    
}
