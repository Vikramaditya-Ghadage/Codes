import java.util.function.*;
// Give the boolean result in true or false format 
class PredicateDemo
{
    public static boolean checkGreaterAndEven(int no,Predicate<Integer> greater, Predicate<Integer> even)
    {
        return greater.and(even).test(no);
    }

    public static boolean checkGreaterOrOdd(int no,Predicate<Integer> greater, Predicate<Integer> even)
    {
        return greater.or(even).test(no);
    }

    public static boolean checkGreaterAndEqual(String str,Predicate<String> greater)
    {
        return greater.and(Predicate.isEqual("vikram")).test(str);
    }


    public static void main(String args[])
    {
        // With Integer

        Predicate<Integer> even= (no) -> no%2==0;
        Predicate<Integer> greaterThan= (no) -> no>10;

        int no=12;

        System.out.println(no+"- Even and greater than 10:"+even.and(greaterThan).test(no));
        System.out.println("Even but not greater than 10:"+even.and(greaterThan).test(8));

        // With String 

        String str="vikram";
        int len=5;
        Predicate<String> pr= (s) -> s.length()>len;
        System.out.println("String "+str+" is greater than "+len+":"+pr.test(str));
        // negate() Returns new Predicate with opposite logic
        System.out.println("String "+str+" is less than "+len+":"+pr.negate().test("Vikram")); 
        
        
        System.out.println("String "+str+" is greaten than "+len+" and equal to vikram:"+
        checkGreaterAndEqual(str,(s)->s.length()>len)); 

    }
}