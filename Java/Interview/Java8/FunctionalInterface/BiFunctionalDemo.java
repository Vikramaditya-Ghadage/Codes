import java.util.function.BiFunction;
class BiFunctionalDemo
{
    public static void main(String args[])
    {
        // In Single line without using curcly bracses there is no need to write return
        BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b); 
        System.out.println(add.apply(10,20));
        
        BiFunction<Integer,Integer,Boolean> sumEven=(a,b)->{return (a+b)%2==0;};

        System.out.println(sumEven.apply(10,20));

    }
}