package Interview.MultiThreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.*;

public class CompatableFutureExample {
    public static void printFasttest()
    {
        CompletableFuture<Long> fact=CompletableFuture.supplyAsync(() ->{
            long N=5;
            long result=1;
            for(int no=1;no<=N;no++)
                result*=no;
            return result;
        });

        CompletableFuture<String> reverse=CompletableFuture.supplyAsync(() ->{
            return new StringBuilder("Vikram").reverse().toString();
        });
        
        CompletableFuture<Object> fastest=CompletableFuture.anyOf(fact,reverse);
        System.out.println(fastest.join());

        CompletableFuture<Void> all =
        CompletableFuture.allOf(fact, reverse);

        all.join(); // wait for both to complete

    }
    public static void blockingUnblockingExample()
    {
        CompletableFuture<Long> fact=CompletableFuture.supplyAsync(() ->{
            long N=5;
            long result=1;
            for(int no=1;no<=N;no++)
                result*=no;
            return result;
        });

        System.out.println(fact.join()); // Non-blocking wait

        try {
            Long result = fact.get();   // blocks and send Checked Exception
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

    public static void errorhandling()
    {
        CompletableFuture<Integer> task1=CompletableFuture.supplyAsync(() -> 10/0)
                        .exceptionally((ex) ->{ 
                            System.out.println("Exception Occured:"+ex.getMessage());
                            return 0;
                        });
        System.out.println(task1.join());
    }

    public static void joinTwoTasks()
    {
        CompletableFuture<String> task1=CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> task2=CompletableFuture.supplyAsync(()->"How are you?");
        CompletableFuture<String> combined=task1.thenCombine(task2,(t1,t2) -> t1 +" "+t2 );
        System.out.println(combined.join());

    }
    public static void main(String[] args) {

        // joinTwoTasks();
        // errorhandling();
        
        printFasttest();
    
    }
    
    
}
