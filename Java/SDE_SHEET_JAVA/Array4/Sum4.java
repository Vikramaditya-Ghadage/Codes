package SDE_SHEET_JAVA.Array4;

import java.util.*;

public class Sum4 {

    public static void printSum(List<Integer> nums,int target)
    {
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {

                int lb=j+1;
                int ub=nums.size()-1;

                while(lb<ub)
                {
                    int sum=nums.get(i)+nums.get(j)+nums.get(lb)+nums.get(ub);
                    if(sum==target)
                    {
                        System.out.println("Found:"+nums.get(i)+"+"+nums.get(j)+"+"+nums.get(lb)+"+"+nums.get(ub)+"="+target);
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
    }
    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
        int target=15;
        printSum(nums,target);
    }
    
}
