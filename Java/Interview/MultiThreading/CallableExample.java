import java.util.concurrent.Callable;  
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 

class CallableMessage implements Callable<String>
{
    public String call () throws Exception  // throw checked exception using callable
    {
        return "callable Example";
    }
}

class FactorialCalculation implements Callable<Integer>
{
    private static int no;

    FactorialCalculation(int no)
    {
        this.no=no;
    }
    public Integer call()
    {
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
public class CallableExample{
    public static void main(String[] args) {

        try {
            ExecutorService executer=Executors.newFixedThreadPool(2);
            Future<String> message=executer.submit(new CallableMessage());
            System.err.println(message.get().toString());

            executer.shutdown();
            
        } catch (Exception ex) {
        }


         try {
            ExecutorService executorService=Executors.newCachedThreadPool();  //Dynamic thread craetion
            Future<Integer> res=executorService.submit(new FactorialCalculation(5));
            System.err.println(res.get().toString());

            executorService.shutdown();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}