import java.util.*;
class Permutation
{
    
    public static void  permutation(Integer[] nums,ArrayList<Integer> ans,int index)
    {
        if(index==nums.length)
        {
            Collections.addAll(ans, nums);
            return;
        }
        for(int j=index;j<nums.length;j++)
        {
            swap(nums,index,j);
            permutation(nums,ans,index+1);
            swap(nums,index,j);
        }
    }
    public static Integer[] swap(Integer nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        return nums;
    }
    public static void main(String args[])
    {
        Integer []nums={1,2,3};
        ArrayList <Integer> ans=new ArrayList<Integer>();        
        Permutation s=new Permutation();
        s.permutation(nums,ans,0);
        System.out.println(ans);

    }
}

