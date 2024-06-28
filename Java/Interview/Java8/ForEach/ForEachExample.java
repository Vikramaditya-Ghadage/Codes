import java.util.*;
class ForEachExample
{
    public static void main(String []args)
    {
        HashSet<Integer> ht=new HashSet<Integer>();
        ArrayList<Integer> al=new ArrayList(Arrays.asList(1,2,3,4,5));
        ht.addAll(al);
        ht.forEach(System.out::println);
    }
}