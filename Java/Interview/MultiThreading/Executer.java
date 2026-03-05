package Interview.MultiThreading;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Executer {
    private static final int N=20; 
    private static final AtomicInteger counter=new AtomicInteger (1);
    private static final Object lock=new Object();
    private static volatile boolean evenFlag=false;


    public static void main(String[] args) {

         ExecutorService executer=Executors.newFixedThreadPool(2);

       // ExecutorService executer = Executors.newCachedThreadPool(); // For dynamic thread craetion

        Runnable oddTask= () ->
        {
            while(counter.get()<N)
            {
                synchronized(lock)
                {
                    while(evenFlag||counter.get()%2==0)
                        try{lock.wait();}catch(Exception ex){System.out.println(ex.getMessage());}

                    System.out.println("Odd No:"+counter.getAndIncrement()+
                    " by " + Thread.currentThread().getName());
                    evenFlag=true;
                    lock.notifyAll();

                }
                
            }
            
        };

        Runnable eventask=()->
        {
            while(counter.get()<N)
            {
                synchronized(lock)
                {
                    while( !evenFlag ||counter.get()%2==1)
                        try{lock.wait();}catch(Exception ex){System.out.println(ex.getMessage());}

                    System.out.println("Even No:"+counter.getAndIncrement()+
                     " by " + Thread.currentThread().getName());
                    evenFlag=false;
                    lock.notifyAll();
                }
            }
        };

        executer.execute(oddTask);
        executer.execute(eventask);

        executer.shutdown();

        // executeByMultipleThreads();

    }
}
