package Sorting;

import java.util.*;

public class MergeSort {

    public static void merge(List<Integer> nums,int lb,int mid,int ub)
    {
        int left=lb;
        int right=mid+1;
        List<Integer> temp=new ArrayList<>();

        while(left<=mid && right<=ub)
        {
            if(nums.get(left)<=nums.get(right))
            {
                temp.add(nums.get(left));
                left++;
            }
            else
            {
                temp.add(nums.get(right));
                right++;
            }
        }

        while(left<=mid)
        {
            temp.add(nums.get(left));
            left++;
        }
        while(right<=ub)
        {
            temp.add(nums.get(right));
            right++;
        }

        for(int i=lb,j=0;i<=ub;i++)
        {
            nums.set(i,temp.get(j++));
        }

    }
    
    public static void mergeSort(List<Integer> nums,int lb,int ub)
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            mergeSort(nums,lb,mid);
            mergeSort(nums,mid+1,ub);
            merge(nums,lb,mid,ub);
            
        }
    }
    public static void main(String[] args) {
      List<Integer> nums=Arrays.asList(5,3,4,2,1);
      mergeSort(nums,0,nums.size()-1);

      System.out.println(nums);

    }
}
