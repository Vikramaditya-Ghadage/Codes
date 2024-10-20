import java.util.*;
class LongestSubstring
{
    public static void main(String args[]) {
     String str="pwwkew";
     HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
     int l=0;
     int r=0;
     int max=1;
     for(;r<str.length();r++)
     {
         char ch=str.charAt(r);
         if(mp.containsKey(ch))
         {
             l=Math.max(max,mp.get(ch));
             
         }
         max=Math.max(max,r-l+1);
         mp.put(ch,r+1);
         
     }
     
     System.out.println(max);  
  
    }
}