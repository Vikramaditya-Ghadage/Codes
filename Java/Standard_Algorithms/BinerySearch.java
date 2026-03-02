import java.util.*;

public class BinerySearch
{
    public static void findElement(List<Integer> nums,int target)
    {
        int lb=0,ub=nums.size()-1;
        
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(nums.get(mid)==target)
            {
                System.out.println("Found at position:"+(mid+1));
                break;
            }
            else if(nums.get(mid)>target)
            {
                ub=mid-1;
            }
            else
                lb=mid+1;
        }
    }
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(1,2,3,5,7,8,9);
        findElement(nums,5);
    }
}