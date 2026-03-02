package Sorting;

import java.util.*;

public class InsertionSort {
    public static void insertionSort(List<Integer> nums)
    {
        int n=nums.size();
        for(int i=1;i<n;i++)
        {
            int value=nums.get(i);
            int j=i-1;
            while(j>=0 && nums.get(j)>value)
            {
                nums.set(j+1, nums.get(j));
                j--;
            }
            nums.set(j+1, value);
        }
    }
    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(5,4,3,2,1);
        insertionSort(nums);
        System.out.println(nums);
    }
}
