import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMapStream {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("vikram Ghadage",100);
        map.put("sanjay Mali",82);
        map.put("Anand Gote",90);
        map.put("Nikhil Tarate",88);

        System.out.println(map.values().stream()
        .max(Comparator.comparing(Integer::valueOf)).get());

        System.out.println(map.keySet().stream()
        .map(str -> {
            String s1=str.split(" ")[0];
            s1=Character.toUpperCase(s1.charAt(0))+s1.substring(1);
            return s1;
        }).collect(Collectors.toList()));

        System.out.println(map.entrySet().stream().
        filter(entry ->entry.getValue()>87).
        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));

        System.out.println(
            map.entrySet().stream().collect(Collectors.summingInt(Map.Entry::getValue))
        );

        System.out.println(map.entrySet().stream().
        max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse(null));

    }
    
}
