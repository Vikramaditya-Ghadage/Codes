package SDE_SHEET_JAVA.Array1;
import java.util.*;

// Time-Complixity: O(N) it's a Linear
public class Sort_0_1_2 {
    
    public static void sortArray(List<Integer> nums)
    {
        int low=0,mid=0,high=nums.size()-1;
        while(mid<=high)
        {
            if(nums.get(mid)==0)
            {
                Collections.swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums.get(mid)==1)
            {
                 mid++;
            }
            else
            {
                Collections.swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(2,0,0,2,2,1,0,1,0,1,2);
        sortArray(nums);
        System.out.println("Sorted Array is:" + nums);
    }
    
}