package Interview.Interview_Codes;

import java.util.*;
import java.util.stream.Collectors;


public class SortMap
{
    public static void SortMapByValue(Map<String,Integer> original)
    {
        Map<String,Integer> sorted=original.entrySet().stream()
                                    .sorted(Comparator.comparing(Map.Entry::getValue))
                                    .collect(Collectors.toMap(
                                    Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,
                                    LinkedHashMap::new));

        System.out.println(sorted);
                                    

    }
    public static void main(String[] args) {

        Map<String, Integer> original = new HashMap<>();
        original.put("B", 75);
        original.put("A", 35);
        original.put("C", 50);

        SortMapByValue(original);
    }
}