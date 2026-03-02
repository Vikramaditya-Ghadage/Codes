import java.util.function.BiFunction;
import java.util.function.Predicate;

interface EvenSum
{
    public boolean isEven(int a,int b);

}
interface Add
{
    public int add(int a,int b,int c,int d);
}
public  class LambdaExample
{
    public static void main(String []args)
    {
        Predicate<Integer> pr=(no)->(no%2==0);
        System.out.println(pr.test(10));

        BiFunction<Integer,Integer,Boolean> fun= (a,b)->{ return (a+b)%2==0?true:false;};

        System.out.println("Even:"+fun.apply(10,21));

        EvenSum evenSum=(a,b)-> { 
            return (a+b)%2==0;
        };


        System.out.println(evenSum.isEven(10, 11));


        Add task1=(a,b,c,d) ->
        {
            return (a+b+c+d)*2;
        };

        System.out.println(task1.add(1,2,3,4));
        
    }
}