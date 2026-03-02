package SDE_SHEET_JAVA.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {

    public static void mergeArray(List<Integer> arr1,List<Integer> arr2)
    {
        int p1=0,p2=0;
        List<Integer> mergeList=new ArrayList<>();
        while(p1<arr1.size() && p2<arr2.size())
        {
            if(arr1.get(p1)<=arr2.get(p2))
            {
                mergeList.add(arr1.get(p1));
                p1++;
            }
            else
            {
                mergeList.add(arr2.get(p2));
                p2++;
            }
        }

        while(p1<arr1.size())
        {
            mergeList.add(arr1.get(p1));
            p1++;
        }

        while(p2<arr2.size())
        {
            mergeList.add(arr2.get(p2));
                p2++;
        }

        System.out.println(mergeList);
    }

    public static void main(String[] args) {
        List<Integer> nums1=Arrays.asList(1,4,6,7,8);
        List<Integer> nums2=Arrays.asList(2,3,5,9,10);

        mergeArray(nums1,nums2);
    }
    
}
