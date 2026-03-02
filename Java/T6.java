public class T6 {

    int cnt=1;
    static int N=10;

    public void printEven()
    {
        synchronized(this)
        {
            while(cnt<N)
            {
                while(cnt%2==1)
                {
                    try{
                        wait();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                System.out.println("Even:"+cnt);

                cnt++;
                notify();
            }
        }
    }


    public void printOdd()
    {
        synchronized(this)
        {
            while(cnt<N)
            {
                while(cnt%2==0)
                {
                    try{
                        wait();
                    }
                    catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }

                System.out.println("Odd:"+cnt);

                cnt++;
                notify();
            }
        }
    }

    public static void main(String []args)
    {
        N=10;
        T6 obj=new T6();
        Thread t1=new Thread(
            new Runnable() {
                public void run()
                {
                    obj.printOdd();
                }
            }
        );

        Thread t2=new Thread(
            new Runnable() {
                public void run()
                {
                    obj.printEven();
                }
            }
        );

        t1.start();
        t2.start();
    }
    
}
