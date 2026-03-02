import java.util.stream.*;
import java.util.*;
public class StreamString
{
    public static void main(String args[])
    {
        List<String> names=Arrays.asList("Sanjay","Vikramaditya","Anand","Sanjay");

        names.stream().distinct().forEach(System.out::println);  // Print Unique Strings

        System.out.println(names.stream().max(Comparator.comparing(String::length)).get());   // Print String with Max Length

        System.out.println(names.stream().min(Comparator.comparing(String::valueOf)).get());  // Print Smaller String

        // names.stream().map(s-> s.split(" ")[0]).distinct().forEach(System.out::println);
        // names.stream().sorted().map(s-> s.split(" ")[0]).distinct().forEach(System.out::println);

        names.stream().sorted().distinct().forEach(System.out::println);   // Ascending Order
        names.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println); //Descending Order

        System.out.println(names.stream().sorted(Comparator.comparing(String::length))
        .collect(Collectors.toList()));   // sort by length

        System.out.println(names.stream().filter(n -> n.equalsIgnoreCase( new StringBuilder(n).
        reverse().toString())).collect(Collectors.toList()));
        

        System.out.println(names.stream()
        .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
        .collect(Collectors.toList()));
      
    }
}