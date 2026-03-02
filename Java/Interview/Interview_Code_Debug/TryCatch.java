package Interview.Interview_Code_Debug;

public class TryCatch {

    public static int test1() 
    {
        try {
            return 10;  // Prepared
            // throw new Exception("Exception occured");
        }
        catch(Exception ex)
        {
            return 100;   
        }
        finally {
                System.out.println("Finally runs");
                return 20;  // Overrides to 20
            }
    }

    public static void test2() 
    {
        
            try 
            {
                System.exit(0);  //JVM exits immediately.
            } 
            finally {
                System.out.println("Finally");  // Output: Nothing -> JVM exits immediately.
            }
    }


    public static void main(String[] args) {

        System.out.println(test1());
        // test2();       // Output: Nothing -> JVM exits immediately.

       
        
    }
}
