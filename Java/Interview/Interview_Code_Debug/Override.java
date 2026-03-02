package Interview.Interview_Code_Debug;

import java.io.IOException;
class SuperClass
{
    int value=100;
    protected Object show() throws Exception   // Here i need to define either exception or 
    // IOException-matched with child class exception
    {
        System.out.println("Superclass:"+ value);
        return "";
    }

    protected Object m1(String str)  // Return type should be either String or object
    {
        return str;
    }
}

class SubClass extends SuperClass
{
    int value=200;
    protected String show() throws IOException
    {
        System.out.println("SubClass:" + value);
        return "";
    }

    public String m1(String str)   // return type shold match otherwise give error
    // visiblity mode need to either same or big one if parent have protected then you can either 
    // use protected or make it higher to pulic but not to private
    {
        return str; //System.out.println("String");
    }

    public void print()
    {
        System.out.println("Subclass Print Call:");
    }
}

class Override
{   
    public static void main(String []args)
    {
        try{

            SuperClass superClass=new SuperClass();
            superClass.show();
            
            SuperClass superClass2=new SubClass();
            superClass2.show();
            superClass.m1("hello");
            // superClass2.print();    // Eror- print method is from subclass

            SubClass subClass=new SubClass();
            subClass.show();
            subClass.print();

            
            // SubClass subClass2=new SuperClass();   // Error

        }catch(Exception ex)   // If multiple throws exception is there then 
        // need to handle everytype of exception or handle parent class Exception for all
        {
            System.out.println(ex.getMessage());
        }




    }
}