package Interview.Collections.Map;

import java.util.*;
public class MapExample1
{
    public static void main(String []args)
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Mango"); map.put(2,"Apple"); 
        map.put(3,"Banana"); map.put(4,"Grapes"); 
        
        for(Map.Entry<Integer,String> mp:map.entrySet())
        {
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
        
    }
}
