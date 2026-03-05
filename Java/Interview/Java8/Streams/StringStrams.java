import java.util.stream.*;
import java.util.*;
public class StringStrams
{
    public static void printMaxStringMyLen(List<String> names)
    {
        System.out.println("Max String By Length:"+names.stream().max(Comparator.comparing(String::length)).get());
    }

    public static void printMinStringMyValue(List<String> names)
    {
        System.out.println("Min String By Value:"+names.stream().min(Comparator.comparing(String::valueOf)).get());
    }

    public static void printUniqueStrings(List<String> names)
    {
        System.out.println("Unique Strings:"+names.stream().distinct().collect(Collectors.toList()));
    }

    public static void printSordedStrings(List<String> names)
    {
        System.out.println("Sorted Strings:"+names.stream()
        .sorted(Comparator.comparing(String::valueOf))
        .collect(Collectors.toList()));

        System.out.println("Sorted Strings Reversed:"+names.stream()
        .sorted(Comparator.comparing(String::valueOf,Comparator.reverseOrder()))
        .collect(Collectors.toList()));
    }

    public static void printTop3StringMyLen(List<String> names)
    {
        System.out.println("Print Top 3 Strings By Length:"+names.stream()
        .sorted(Comparator.comparing(String::length,Comparator.reverseOrder()))
        .limit(3)
        .collect(Collectors.toList()));
    }
    public static void printSecondHigestLenString(List<String> names)
    {
        System.out.println("Print Second Highest String By Length:"+names.stream()
        .sorted(Comparator.comparing(String::length,Comparator.reverseOrder()))
        .skip(1)
        .findFirst()
        .get());
    }

    public static void main(String args[])
    {
        List<String> names=Arrays.asList("Sanjay","Vikramaditya","Anand","Nikhil","Sanjay","AdityaK");

        printMaxStringMyLen(names);
        printMinStringMyValue(names);
        printUniqueStrings(names);

        printTop3StringMyLen(names);
        printSordedStrings(names);

        printSecondHigestLenString(names);

       

        // System.out.println(names.stream().sorted(Comparator.comparing(String::length))
        // .collect(Collectors.toList()));   // sort by length

        // System.out.println(names.stream().filter(n -> n.equalsIgnoreCase( new StringBuilder(n).
        // reverse().toString())).collect(Collectors.toList()));
        

        // System.out.println(names.stream()
        // .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
        // .collect(Collectors.toList()));
      
    }
}