package SDE_SHEET_JAVA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumSubSequence {

    public static void printSubSequenceSum(List<Integer> nums,List<Integer> ds,List<List<Integer>> ans,int index,int sum)
    {
        if(index>=nums.size())
        {
           // System.out.println(ds+" sum:"+sum);
            if(sum==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }


        ds.add(nums.get(index));
        printSubSequenceSum(nums,ds,ans,index+1,sum-nums.get(index));
        ds.remove(ds.size()-1);


        printSubSequenceSum(nums,ds,ans,index+1,sum);
    }
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3);
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        printSubSequenceSum(nums,ds,ans,0,3);
        System.out.println(ans);
    }
}
