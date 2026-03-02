import java.util.function.Consumer;
import java.util.*;
//Cunsumer --> Accept One parameter as input but not produce any output mainly used to modify the data
class ConsumerDemo
{
    public static void updateList(List<Integer> nums)
    {
        Consumer<List<Integer>> square= (n) -> {
            for(int i=0;i<n.size();i++)
            n.set(i,n.get(i)*n.get(i));

        };

        square.accept(nums);
    }
    public static void main(String args[])
    {
        Consumer<Integer> display= no -> System.out.println("Cube is:"+(no*no*no));
        display.accept(10);

        
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        System.out.println(nums);
        updateList(nums);

        System.out.println(nums);
    }
}