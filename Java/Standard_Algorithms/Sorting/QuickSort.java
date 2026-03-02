package Sorting;

import java.util.*;

public class QuickSort {

    public static int partition(List<Integer> nums,int lb,int ub)
    {
        int pivot=nums.get(ub);
        int i=lb-1;
        for(int j=lb;j<ub;j++)
        {
            if(nums.get(j)<=pivot)
            {
                i++;
                Collections.swap(nums, i, j);
            }
        }

        Collections.swap(nums, i+1,ub);
        
        return i+1;
        
    }

    public static void quickSort(List<Integer> nums,int lb,int ub)
    {
        if(lb<ub)
        {
            int pivot=partition(nums,lb,ub);
            quickSort(nums, lb, pivot-1);
            quickSort(nums, pivot+1, ub);
        }
    }
    public static void main(String[] args) {

        List<Integer> nums=Arrays.asList(5,4,3,2,1);
        quickSort(nums,0,nums.size()-1);

        System.out.println(nums);
    }
}
