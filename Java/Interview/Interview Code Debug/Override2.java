 class TestI {
 public int x =100;
    public void m1(){
    System.out.println("Super");
    }
}

 class TestClass extends  TestI{
   public int x = 200;
    public void m1(){
        x=300;
        System.out.println("Child :"+x);
    }
    public void m2(){
        System.out.println("Hi Hello");
    }
 
   
}

class Override2
{
   public static void main(String[] args) {
        TestI i = new TestClass();
        System.out.println(i.x);
        i.m1();
       // i.m2();  //Error canot call child class not abstract method
    }
}