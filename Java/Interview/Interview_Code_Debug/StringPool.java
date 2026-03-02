package Interview.Interview_Code_Debug;
public class StringPool
{
     
  public static void main(String[] args)
  {
      Integer a = 127;
      Integer b = 127;
      
      Integer c = 128;
      Integer d = 128;
      
      int e = 127;
      int f = 128;
    
      System.out.println(a == b); // true   Both autoboxed to same cached Integer object (-128 to 127 range).
      System.out.println(c == d); // false  Outside cache (-128 to 127),creates separate Heap objects.
      System.out.println(a == e); // true   Integer unboxes to int for primitive value comparison
      System.out.println(f == c); // true   Integer unboxes to int for primitive value comparison
      

      System.out.println("************* Strings ********************");
    
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String("Hello");
      String s4 = new String("Hello"); 

      String s5=s1.intern();

      System.out.println(s1 == s2); //  true
      System.out.println(s3 == s4); // false
      System.out.println(s1 == s3); //  false
      System.out.println(s1 == s5); //  True

      System.out.println(s3.equals(s4)); //  True


      System.out.println("************* StringBuffer ********************");
      StringBuffer sf1=new StringBuffer("abc");
      StringBuffer sf2=new StringBuffer("abc");

      System.out.println(sf1==sf2);   // false
      System.out.println(sf1.equals(sf2));  // false StringBuffer equals method checks object

  }

}