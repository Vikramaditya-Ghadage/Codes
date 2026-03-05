import java.util.*;
import java.util.stream.*;
class IntegerStream
{
    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);


        System.out.println("Total unique element:"+nums.stream().distinct().count());

        System.out.println("Total unique element:"+nums.stream().distinct().limit(5).collect(Collectors.toList()));

        System.out.println("Max Element:"+nums.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println("Min Element:"+nums.stream().min(Comparator.comparing(Integer::valueOf)).get());

        System.out.println("Min is:"+nums.stream().collect(Collectors.averagingInt(Integer::valueOf)));
        System.out.println("Sum is:"+nums.stream().collect(Collectors.summingInt(Integer::valueOf)));


        System.out.println("Limit Elements:"+nums.stream().limit(5).collect(Collectors.toList())); 

        
        System.out.println("Skip Elements:"+nums.stream().skip(2).collect(Collectors.toList())); 

        System.out.println("Even Unique:"+nums.stream().filter(n -> n % 2 ==0).distinct().collect(Collectors.toList()));

        System.out.println("Sort ASC:"+nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList())); 

        System.out.println("Sort ASC:"+nums.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
        System.out.println("Sort DES:"+nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        
        System.out.println("Even Add 1:"+nums.stream().map(s -> { return (s%2==0)?s+1:s;}).collect(Collectors.toList()));


    }
}