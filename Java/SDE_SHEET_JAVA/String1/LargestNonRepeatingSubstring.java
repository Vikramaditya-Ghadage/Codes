package SDE_SHEET_JAVA.String1;

import java.util.*;

public class LargestNonRepeatingSubstring {

    public static String findLarestCommString(String str)
    {
        String ans="";
        int maxlen=1;
        int lb=0,ub=0;
        int n=str.length();
        Map<Character,Integer> map=new HashMap<>();
        while(ub<n)
        {
            char ch=str.charAt(ub);
            if(map.containsKey(ch))
            {
                lb=Math.max(map.get(ch), lb);
            }
            map.put(ch,ub+1);
            int len=ub-lb;
            System.out.println(len);
            if(len>maxlen)
            {
                maxlen=len;
                ans=str.substring(lb,ub+1);
            }
            ub++;
        }
        return ans;
    }
    public static void main(String []args)
    {
        String str="ababababcdeffbababa";
        System.out.println(findLarestCommString(str));
        
    }
}