package SDE_SHEET_JAVA.Array1;
import java.util.*;
public class Permutation
{
    
    public static void permutation(ArrayList<Integer> nums,ArrayList<ArrayList<Integer>> ans,int index)
    {
        if(index>=nums.size())
        {
            ans.add(new ArrayList<>(nums));
            return;
        }

        for(int j=index;j<nums.size();j++)
        {
            Collections.swap(nums, j, index);
            permutation(nums, ans, index+1);
            Collections.swap(nums, j, index);
        }
       
    }

    public static void main(String args[])
    {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        permutation(nums,ans,0);

        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }

    }
}

