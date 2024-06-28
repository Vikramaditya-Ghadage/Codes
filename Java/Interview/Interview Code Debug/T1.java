class T1
{
     
public static void main(String[] args){
  Integer a = 100;
  Integer b = 200;
  
  
  Integer c = 100;
  Integer d = 200;
  
  int e = 100;
  int f = 200;
 
  String s1 = "Hello";
  String s2 = "Hello";
  String s3 = new String("Hello");
  String s4 = new String("Hello"); 
  
  System.out.println(a == b); //  //false
  System.out.println(c == d); // // false
  System.out.println(a == c); // false
  System.out.println(b == d); // false
  System.out.println(a == e); // false
  System.out.println(b == f); // false

  System.out.println("*******");
 
  System.out.println(s1 == s2); //  true
  System.out.println(s3 == s4); // false
  System.out.println(s1 == s3); //  false
}

}