import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class String1 {
    public static void main(String[] args) {
        String str="aabcdbba";
        int n=str.length();
        LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> map:mp.entrySet())
        {
            if(map.getValue()==1)
                System.err.print(map.getKey());
        }

    }
}
