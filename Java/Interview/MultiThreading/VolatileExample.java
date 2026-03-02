class Printer
{
    // private  boolean flag=false;  // without volatile reader will stuck

    private volatile boolean flag=false;

    public void setFlag()
    {
        System.out.println("Flag Changed by writer to true");
        flag=true;
    }

    public void print()
    {
        while(!flag)
        {
            // Reader will stuck in loop here but if we use volatile here
            // reader thread immediatly get latest flag=true after changed by writer
        }
        System.out.println("Flag is now set to:"+flag);
    }
}
public class VolatileExample {
    public static void main(String[] args) {

        Printer printer=new Printer();

        Thread reader=new Thread(()->{
                
                printer.print();
            }
        );

        Thread writer=new Thread(()->{

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                printer.setFlag();
            }
        );

        reader.start();
        writer.start();

        
    }
}
