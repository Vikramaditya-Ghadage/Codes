import java.util.function.*;
class PredicateDemo
{
    public static void main(String args[])
    {
        Predicate<String> pr= (s) -> s.length()>5;
        System.out.println(pr.test("Vikram"));

    }
}