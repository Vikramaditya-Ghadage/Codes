import java.util.*;

public class CodeExample2 {

    public static void findNextPer(List<Integer> nums)
    {
        int n=nums.size();
        int k=n-2;
        while(k>=0)
        {
            if(nums.get(k)<nums.get(k+1))
                break;
            k--;
        }
        if(k<0)
            Collections.reverse(nums);

        int ub=n-1;
        while(ub>k)
        {
            if(nums.get(k)<nums.get(ub))
                break;
            ub--;
        }
        Collections.swap(nums, k, ub);
        Collections.reverse(nums.subList(k+1, n));
    }

    public static void main(String[] args) {
    
        List<Integer> nums=Arrays.asList(1,2,3);
        findNextPer(nums);
        System.out.println(nums);

    }
    
}
