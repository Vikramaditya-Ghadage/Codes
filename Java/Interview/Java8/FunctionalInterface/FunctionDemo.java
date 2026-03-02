import java.util.function.Function;
//Function --> Accept One input parameter and product desirable output of second type
public class FunctionDemo
{
    public static Integer demoAndThen(Function<Integer,Integer> square)
    {
        Function<Integer,Integer> multiplyByTwo=(n) -> n*2;
        return square.andThen(multiplyByTwo).apply(10);
    }
    public static void main(String args[])
    {
        Function<Integer,Integer> square= (no) ->  (no*no);
        Function<Integer,Integer> multiplyByTwo= (no) -> no*2;

        int no=5;
        System.out.println("Square is:"+square.apply(no));
        System.out.println("Square is and divide by 10:"+square.andThen(multiplyByTwo).apply(no));

        System.out.println(demoAndThen(square));

    }
}