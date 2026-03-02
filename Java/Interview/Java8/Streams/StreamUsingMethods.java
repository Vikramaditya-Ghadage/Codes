import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class StreamUsingMethods {

    public static Predicate<String> filterFirstName(String input)
    {
        return (str) -> str.startsWith(input);
        
    }

    public static Predicate<String> checkStartWithCapital()
    {
        return (str) -> Character.isUpperCase(str.charAt(0)); 
    }

    public static Predicate<Integer> checkEven()
    {
        return (no) -> (no%2==0); 
    }

    public static Function<Integer,Integer> calSquare()
    {
        return (no) -> (no*no); 
    }
    public static void main(String[] args) {
        List<String> input=Arrays.asList("aavi","abbccc","Vikramm","aaab","bbaacdfee");

        System.out.println(input.stream().filter(StreamUsingMethods.filterFirstName("a")).collect(Collectors.toList()));

        List<Integer> nums=Arrays.asList(1,2,4,5,6);

        System.out.println(nums.stream().filter(StreamUsingMethods.checkEven()).
        map(StreamUsingMethods.calSquare()).collect(Collectors.toList()));
    }
}
