class SuperClass
{
    int value=100;
    public void show()
    {
        System.out.println("Superclass:"+ value);
    }
}
class SubClass extends SuperClass
{
    int value=200;
    public void show()
    {
        System.out.println("SubClass:" + value);
    }

    public void hello()
    {
        System.out.println("Hello:" + value);
    }
}
class Override
{   
    public static void main(String []args)
    {
        SuperClass obj=new SubClass();
        obj.show();

    }
}