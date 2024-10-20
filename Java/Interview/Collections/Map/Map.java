import java.util.Map.*;
import java.util.Map.Entry;
import java.util.*;
class Map
{
    public static void main(String []args)
    {
        // HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
        // hash_map.put(1,"Vikram");
        // hash_map.put(2,"Anand");

        // for(Map.Entry m:hash_map.entrySet())
        // System.out.println(m.getKey()+":"+m.getValue());


   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry<Integer, String> m : map.entrySet())    
    System.out.println(m.getKey()+" "+m.getValue()); 

        
    }
}
