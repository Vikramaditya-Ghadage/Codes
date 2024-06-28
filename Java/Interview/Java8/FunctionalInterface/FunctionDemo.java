import java.util.function.Function;
//Function --> Accept One input parameter and product desirable output of second type
{
    public static void main(String args[])
    {
        Function<Integer,Integer> square= (a) -> a*a;
        System.out.println(square.apply(10));
    }
}