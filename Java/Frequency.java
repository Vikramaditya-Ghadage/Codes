import java.security.Key;
import java.util.*;

import com.sun.jdi.Value;
public class Frequency {
    public static void main(String[] args) {

        String str="perficient";
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxLen=0;

        for(Map.Entry<Character,Integer> mp:map.entrySet())
        {
                if(mp.getValue()>maxLen)
                {
                  maxLen=mp.getValue();
                }
                
        }


       for(Map.Entry<Character,Integer> mp:map.entrySet()){
            if(mp.getValue()==maxLen)
            {
                System.out.println(mp.getKey()+":"+maxLen);
            }
        }

        
    }
    
}
