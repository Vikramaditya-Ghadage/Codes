import java.util.stream.*;
import java.util.*;
class Stream3
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
        names.stream().sorted(Collections.reverseOrder()).distinct().forEach(System.out::println); //Descending Order
      
    }
}