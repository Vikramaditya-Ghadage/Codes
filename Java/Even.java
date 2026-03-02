import java.util.*;
import java.util.stream.Collectors;

//output -> 1 ,3,3,5,5,7
public class Even {

    public static List<Integer> evenOdd(List<Integer> nums)
    {
        return nums.stream().map( n -> { return (n%2==0)?n+1:n;}).collect(Collectors.toList());
    }
    
    // @Test 
    // public void testOdd()
    // {
    //     List<Integer> input=Arrays.asList(1,3,5,7,9);

    //     List<Integer> expected=Arrays.asList(1,3, 5, 7, 9);
    //     List<Integer> actual=evenOdd(input);
    //     assertEquals(expected,evenOdd(input));
    // }

    // @Test 
    // public void testEvenOdd()
    // {
    //     List<Integer> input=Arrays.asList(2,4,6,8);

    //     List<Integer> expected=Arrays.asList(3, 5, 7, 9);
    //     List<Integer> actual=evenOdd(input);
    //     assertEqual(actual,expected);
    // }

    // @Test
    // public void testEmptyList()
    // {
    //     assertEqual(Arrays.asList(),evenOdd(Arrays.asList()))
    // }

    public static void main(String []args)
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);

        // System.out.println(nums.stream().map( n -> { return (n%2==0)?n+1:n;}).collect(Collectors.toList()));

    }
    
}
