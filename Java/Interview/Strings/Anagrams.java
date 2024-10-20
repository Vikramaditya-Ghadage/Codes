// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Anagrams {
    public static void main(String[] args) {
        List<String> str1=Arrays.asList("listen", "silent", "enlist", "eat", "tea", "tan", "nat", "bat");
        
        HashMap<String,List<String>> mp=new HashMap<String,List<String>>();
        for(String s1:str1)
        {
            char []tmp=s1.toCharArray();
            Arrays.sort(tmp);
            String s2=new String(tmp);
            
            if(!mp.containsKey(s2))
            mp.put(s2,new ArrayList<String>());
            
            mp.get(s2).add(s1);
            
        }
        
        List<List<String>> anagrams=new ArrayList<>(mp.values());
        
         for (List<String> group : anagrams) {
            System.out.println(group);
        }
    }
    
}
