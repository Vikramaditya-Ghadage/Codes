package SDE_SHEET_JAVA.Array1;

import java.util.Arrays;
import java.util.List;

// Time-Complixity: O(N^3)
public class SubArray {
    public static void printSubArrayWithKSize(List<Integer> nums,int k)
    {
        int n=nums.size();
        for(int i=0;i<n-k+1;i++)
        {
            System.out.println();
            for(int j=i;j<i+k;j++)
            {
                System.out.print(" "+nums.get(j));
            }
        }
    }
    
    public static void printAllSubArray(List<Integer> nums)
    {
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            System.out.println();
            for(int j=i;j<n;j++)
            {
               // System.out.print(nums.get(j));
   
                int sum=0;
                System.out.println();
                for(int k=i;k<=j;k++)
                {
                    sum+=nums.get(k);
                    System.out.print(nums.get(k));
                }
            }
        }
    }

    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        printAllSubArray(nums);

        //printSubArrayWithKSize(nums,2);
    }

    
}
