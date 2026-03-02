package SDE_SHEET_JAVA.Array2;

import java.util.*;

public class MergeInterval {
    public static void mergeInterval(List<List<Integer>> nums)
    {
        Collections.sort(nums,(a,b)-> Integer.compare(a.get(0), b.get(0)));

        List<List<Integer>> temp=new ArrayList<>();
        temp.add(nums.get(0));

        for(int i=1;i<nums.size();i++)
        {
            List<Integer> last=temp.get(temp.size()-1);
            if(last.get(1)<nums.get(i).get(0))
                temp.add(nums.get(i));
            else
                last.set(1,Math.max(last.get(1),nums.get(i).get(1)));

        }

        System.out.println(temp);

    }
    public static void main(String []args)
    {
        List<List<Integer>> nums= new ArrayList<>();

        nums.add(Arrays.asList(1, 3));
        nums.add(Arrays.asList(8, 11));
        nums.add(Arrays.asList(7, 10));
        nums.add(Arrays.asList(2, 6));
        nums.add(Arrays.asList(15, 18));

        mergeInterval(nums);

        System.out.println(nums);
    }
}
