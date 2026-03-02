// String input = “AABBBDDDD”;
// String output = “A2B3D4”;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {

        String str="AABBBDDDD";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            map.put(ch,1);
        }

        for(Map.Entry mp:map.entrySet())
        {
            System.out.print(mp.getKey()+""+mp.getValue());
        }


    }
    
}
