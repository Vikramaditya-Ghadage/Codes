package dynamic;

import java.util.HashMap;

public class LongestSubString {
    public static void calLongestSubString(String str)
    {
        int lb=0,ub=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(ub=0;ub<str.length();ub++)
        {
            char ch=str.charAt(ub);

            if(map.containsKey(ch))
                lb=Math.max(lb,map.get(ch));
            
            map.put(ch,ub+1);

            int len=ub-lb+1;
            if(len>maxLen)
            {
                maxLen=len;
            }
        }
        System.out.println("Max length is:"+maxLen);
    }
    public static void main(String[] args) {
        String str="abcmadambbaa";
        calLongestSubString(str);
    }
}
