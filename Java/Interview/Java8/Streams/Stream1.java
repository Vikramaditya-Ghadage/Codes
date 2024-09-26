import java.util.*;
//import java.util.stream.Collectors;
import java.util.stream.*;
class Stream1
{
    public static void main(String []args)
    {
        List<Integer> no=Arrays.asList(1,2,3,4,5,1,3);

        System.out.println("Even No:");
        no.stream().filter(i-> i%2==0).forEach(System.out::println);

        List<Integer> unique=no.stream().distinct().collect(Collectors.toList());
      //  unique.forEach(System.out::print);

        System.out.println("Sum is:"+no.stream().reduce(0, Integer::sum));
        
        System.out.println("Maximum Value is:"+no.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println("Minimum Value is:"+no.stream().min(Comparator.comparing(Integer::valueOf)).get());

    }
}