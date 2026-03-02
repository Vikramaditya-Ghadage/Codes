public final class Singelton { 

    // private static final Singelton singeltonObj=new Singelton();  // Eagar Loading

    private static volatile Singelton singeltonObj;  // static and volatile object
    private Singelton()   // private constuctor
    {}

    public static Singelton getInstance()
    {
        if(singeltonObj==null)
        {
            synchronized(Singelton.class)
            {
                if(singeltonObj==null) // To allowed concurrent user we can use double locking
                {
                    singeltonObj=new Singelton();  // and row level lock on counter that it stored on datbase rateLimit table       
                
                }
            
            }
            
        }
            return singeltonObj;

    }


    public static void main(String[] args) {

         Singelton singeltonObj1=Singelton.getInstance();
         Singelton singeltonObj2=Singelton.getInstance();

         System.out.println(singeltonObj1==singeltonObj2);
        
    }
    
}
