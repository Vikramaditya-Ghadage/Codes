package Interview.Interview_Codes;
import java.util.function.Function;
import java.util.*;
public class StringPipelIne<T>
{
    // List<Function<T,T>> steps=new ArrayList<>();
    Function<T,T> pipeline=Function.identity();
    public StringPipelIne<T> addStep(Function<T,T> step)
    {
        pipeline=pipeline.andThen(step);

        return this;
    }
    public T execute(T input)
    {
        
         return pipeline.apply(input);

    }

    public static void main(String[] args) {
        
        StringPipelIne<String> pipeline = new StringPipelIne();
        pipeline.addStep(String::trim).addStep(String::toLowerCase)
        .addStep(s -> s.replaceAll("[^a-z0-9 ]", ""))
        .addStep(s -> s.replace(" ", "_"))
        .addStep(s -> "user_" + s);;

        String res=pipeline.execute("  John Doe@123 ");
        System.out.println(res);
      
    }
    
}
