package SDE_SHEET_JAVA.Recursion;

import java.util.*;

public class SubSequence {
    public static void printSubSequence(List<Integer> nums,List<Integer> ds,List<List<Integer>> ans,int index)
    {
        if(index>=nums.size())
        {
            if(!ds.isEmpty())
            ans.add(new ArrayList<>(ds));
            return;
        }

        //include
        ds.add(nums.get(index));
        printSubSequence(nums,ds,ans,index+1);
        ds.remove(ds.size()-1);


        //exclude
        printSubSequence(nums,ds,ans,index+1);

    } 
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3);
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        printSubSequence(nums,ds,ans,0);
        System.out.println(ans);
    }
    
}
