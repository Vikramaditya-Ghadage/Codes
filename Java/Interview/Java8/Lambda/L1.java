import java.util.function.Predicate;
class L1
{
    public static void main(String []args)
    {
        Predicate<Integer> pr=(no)->(no%2==0);
        System.out.println(pr.test(10));
        
    }
}