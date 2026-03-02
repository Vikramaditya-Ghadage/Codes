package SDE_SHEET_JAVA.String1;
import java.util.*;
import java.util.Map;
class Anagrams {

    
    public static boolean checkAnagram(String s1,String s2)
    {
        s1=s1.toLowerCase().replaceAll("[^a-z]", "");
        s2=s2.toLowerCase().replaceAll("[^a-z]", "");

        // System.out.println(s1+":"+s2);
        if(s1.length()!=s2.length()) return false;

        Map<Character,Integer> cnt=new HashMap<>();

        for(char ch:s1.toCharArray())
        {
            cnt.put(ch, cnt.getOrDefault(ch, 0)+1);
        }

        for(char ch:s2.toCharArray())
        {
            cnt.put(ch, cnt.getOrDefault(ch, 0)-1);

            if(cnt.get(ch)==0) cnt.remove(ch);
        }

        return cnt.isEmpty();
    }

    public static boolean checkAnagram2(String s1,String s2)
    {
        char [] t1=s1.toCharArray();
        char [] t2=s2.toCharArray();
        Arrays.sort(t1);
        Arrays.sort(t2);

        if(Arrays.equals(t1, t2))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        // List<String> str1=Arrays.asList("listen", "silent", "enlist", "eat", "tea", "tan", "nat", "bat");
        
        // HashMap<String,List<String>> mp=new HashMap<String,List<String>>();
        // for(String s1:str1)
        // {
        //     char []tmp=s1.toCharArray();
        //     Arrays.sort(tmp);
        //     String s2=new String(tmp);
            
        //     if(!mp.containsKey(s2))
        //     mp.put(s2,new ArrayList<String>());
            
        //     mp.get(s2).add(s1);
            
        // }
        
        // List<List<String>> anagrams=new ArrayList<>(mp.values());
        
        //  for (List<String> group : anagrams) {
        //     System.out.println(group);
        // }


        System.out.println(checkAnagram("madam","madam"));
        System.out.println(checkAnagram2("madam","madam"));
    }
    
}
