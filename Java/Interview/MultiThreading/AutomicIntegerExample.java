import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
    //private int counter=0;  //privoius
    private AtomicInteger counter=new AtomicInteger(0);

    public void increaseCounter()
    {
        counter.getAndIncrement();
    }

    public int getCounter()
    {
        return counter.get();
    }
}
public class AutomicIntegerExample {
 
    
    public static void main(String[] args) throws InterruptedException {

        Counter cnt=new Counter();

        Thread t1=new Thread(()->{
            for(int i=1;i<=10000;i++)
                cnt.increaseCounter();

        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=10000;i++)
                cnt.increaseCounter();

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

       // Thread.sleep(1000);


        System.out.println(cnt.getCounter());  // without automic the value will not come to 20k
        
    }
}
