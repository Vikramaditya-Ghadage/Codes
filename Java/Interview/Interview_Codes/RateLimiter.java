import java.util.concurrent.atomic.AtomicLong;

public class RateLimiter {
    
    private final long maxRequestCount;
    private final long windowSizeInMills;

    private AtomicLong currentReuestCount;
    private long windowStart;

    RateLimiter(long maxRequestCount,long windowSizeInMills)
    {
        this.maxRequestCount=maxRequestCount;
        this.windowSizeInMills=windowSizeInMills;

        currentReuestCount.set(0);
        windowStart=System.currentTimeMillis();
    }

    public synchronized boolean allowRequest()
    {
            long currentTime=System.currentTimeMillis();

            if(currentTime-windowStart>=windowSizeInMills)
            {
                windowStart=currentTime;
                currentReuestCount.set(0);
            }
            if(currentReuestCount.get()<maxRequestCount)
            {
                currentReuestCount.getAndIncrement();
                return true;
            }
                

        return false;


    }

     public static void main(String[] args) {

        RateLimiter limiter = new RateLimiter(5, 1000); // 5 req per 1 sec

        for (int i = 1; i <= 1000; i++) {
            if (limiter.allowRequest()) {
                synchronized(limiter)
                {
                    if(limiter.allowRequest()) // To allowed concurrent user we can use double locking
                            // and row level lock on counter that it stored on datbase rateLimit table
                    System.out.println("Allowed " + i);
                }
                
            } else {
                System.out.println("Blocked " + i);
            }
        }

        
    }

}
