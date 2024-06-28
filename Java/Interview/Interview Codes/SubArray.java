import java.util.*;
class SubArray
{
    ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
    public void printSubArrayRecurrsion(ArrayList<Integer> nums,ArrayList<Integer> ds,int n,int start,int end)
    {
        if(end>=n)
        {
            return;
        }
        if(start>end)
        {
            printSubArrayRecurrsion(nums,ds,n,0,end+1);
        }
        else
        {
            for(int i=start;i<=end;i++)
            ds.add(nums.get(i));
            ans.add(ds);
            ds.clear();
            printSubArrayRecurrsion(nums,ds,n,start+1,end);
            
        }
    }
    public void printSubArray(ArrayList<Integer> nums)
    {
        ArrayList<Integer> ds=new ArrayList<Integer>();
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i;j<nums.size();j++)
            {
                System.out.println();
                for(int k=i;k<=j;k++)
                {
                    ds.add(nums.get(k));
                }
                ans.add(ds);
               
                ds.clear();
            }
             display();
        }
    }
    void display()
    {
        for(int i=0;i<ans.size();i++)
        {
            System.out.println();
            for(int j=0;j<ans.get(i).size();j++)
            System.out.print(ans.get(i).get(j));
        }
    }
    public static void main(String args[])
    {
        ArrayList<Integer> nums=new ArrayList(Arrays.asList(1,2,3,4));
        
        SubArray ob=new SubArray();
        // ArrayList<Integer> ds=new ArrayList<Integer>();

        // ob.printSubArrayRecurrsion(nums,ds,nums.size(),0,0);
        ob.printSubArray(nums);
        ob.display();
       // al.forEach(System.out::println);
    }
}