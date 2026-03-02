package SDE_SHEET_JAVA.Array1;

import java.util.*;

public class Pascal {

    public static void printPascalTraingle(int n)
    {   
        List<List<Integer>> nums=new ArrayList<List<Integer>>(); 

        for(int i=0;i<n;i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    row.add(1);
                else
                {
                    int val= nums.get(i-1).get(j-1)+nums.get(i-1).get(j);
                    row.add(val);
                }
                   
            }
            nums.add(row);
        }

        for(int i=0;i<nums.size();i++)
        System.out.println(nums.get(i));
    }
     public static void main(String args[])
    {
        int n=5;
        printPascalTraingle(n);
    }
}
