package SDE_SHEET_JAVA.Array4;
import java.util.*;

public class Sum3 {

    public static void printSum(List<Integer> nums,int target)
    {
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++)
        {
            int lb=i+1;
            int ub=nums.size()-1;

            while(lb<ub)
            {
                int sum=nums.get(i)+nums.get(lb)+nums.get(ub);
                if(sum==target)
                {
                    System.out.println("Found:"+nums.get(i)+"+"+nums.get(lb)+"+"+nums.get(ub)+"="+target);
                    lb++;
                    ub--;
                }
                if(sum>target)
                    ub--;
                if(sum<target)
                    lb++;
            }
        }
    }
    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(5,3,1,2,7,6,8,9);
        int target=100;
        printSum(nums,target);
    }
    
}
