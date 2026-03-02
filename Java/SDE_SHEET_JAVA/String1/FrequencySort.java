package SDE_SHEET_JAVA.String1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {
    public static void main(String[] args) {
        String str = "aabbbccd";
        Map<Character, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Character>> treemap = new TreeMap<>();
        
        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Group by frequency
        for (Map.Entry<Character, Integer> mp : map.entrySet()) {
            int freq = mp.getValue();
            char ch = mp.getKey();
            treemap.computeIfAbsent(freq, k -> new ArrayList<>()).add(ch);
        }
        
        
        System.out.println(treemap); 


    }
}
