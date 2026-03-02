import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class CodeExample {
    private static int N=10;
    private static Object lock=new Object();
    private static AtomicInteger counter=new AtomicInteger(1);
    private static volatile boolean evenFlag=false;

    public static void main(String[] args) {

        ExecutorService executorService=Executors.newCachedThreadPool();

        Runnable even =()->
        {
            while(counter.get()<N)
            {
                synchronized(lock)
                {
                    while(counter.get()%2==1 && !evenFlag)
                    {
                        try{
                            lock.wait();
                        }
                        catch(Exception ex) 
                        {
                           System.out.println(ex.getMessage()); 
                        }
                    }

                    System.out.println("Even no:"+counter.getAndIncrement()+"-"+Thread.currentThread().getName());
                    evenFlag=false;
                    lock.notifyAll();
                }
            }
        };


        Runnable odd =()->
        {
            while(counter.get()<N)
            {
                synchronized(lock)
                {
                    while(counter.get()%2==0 && evenFlag)
                    {
                        try{
                            lock.wait();
                        }
                        catch(Exception ex) 
                        {
                           System.out.println(ex.getMessage()); 
                        }
                    }

                    System.out.println("Odd No:"+counter.getAndIncrement()+"-"+Thread.currentThread().getName());
                    evenFlag=true;
                    lock.notifyAll();
                }
            }
        };

        executorService.submit(odd);
        executorService.submit(even);

        executorService.shutdown();


       
    }
    
}
