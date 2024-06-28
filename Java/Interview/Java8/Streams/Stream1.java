import java.util.*;
//import java.util.stream.Collectors;
import java.util.stream.*;
class Stream1
{
    public static List<String> filterByFirstName(List<String>names,String nm)
    {
      return names.stream().filter( s -> s.startsWith("Vi")).collect(Collectors.toList());  
    }
    public static List<String> sortString(List<String>names)
    {
         return names.stream().sorted().collect(Collectors.toList());
    }
    public static void main(String []args)
    {
        List<Integer> no=Arrays.asList(1,2,3,4,5,1,3);
        List<String> names=Arrays.asList("Vikram Ghadage","Sanjay Mali","Ananad Gote","Anand Jagtap");
        // List<Integer> even=no.stream().filter(i-> i%2==0).collect(Collectors.toList());
        // even.forEach(System.out::println);

        // List<Integer> unique=no.stream().distinct().collect(Collectors.toList());
        // unique.forEach(System.out::println);
        // no.stream().distinct().forEach(System.out::println);

        System.out.println(no.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(names.stream().min(Comparator.comparing(String::valueOf)).get());

        // names.stream().map(s-> s.split(" ")[0]).forEach(System.out::println);

        //names.stream().map(s-> s.split(" ")[0]).distinct().forEach(System.out::println);
        //names.stream().sorted().map(s-> s.split(" ")[0]).distinct().forEach(System.out::println);

        // names.stream().sorted(Collections.reverseOrder()).map(s-> s.split(" ")[0]).distinct().forEach(System.out::println);
      
        // List<String> names=Arrays.asList("Anand","Vikram","Sanjay","Vivek");
        // names=sortString(names);
        // List<String> filterList=filterByFirstName(names,"Vi");
        // names.forEach(System.out::println);
        // filterList.forEach(System.out::println);
    }
}