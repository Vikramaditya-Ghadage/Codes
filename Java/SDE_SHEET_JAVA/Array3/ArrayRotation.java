package SDE_SHEET_JAVA.Array3;

import java.util.*;

public class ArrayRotation {
    public static void leftRotation(List<Integer> nums,int k)
    {
        int n=nums.size()-1;
        List<Integer> tempList=new ArrayList<>();
        tempList.addAll(nums.subList(k, n));
        tempList.addAll( nums.subList(0, 0+k+1));
        System.out.println(tempList);
    }
    public static void main(String[] args) {
        
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        leftRotation(nums,2);
        System.out.println(nums);

    }
}
