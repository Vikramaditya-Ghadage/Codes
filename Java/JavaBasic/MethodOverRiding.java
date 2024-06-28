class Parent
{
    public void show()
    {
        System.out.println("Parent");
    }
}

interface A1
{
    default public void show()
    {
        System.out.println("A1");
    }
}

interface B1
{
    default public void show()
    {
        System.out.println("B1");
    }
}
class MethodOverRiding implements A1,B1
{
    public void show()
    {
        A1.super.show();
        B1.super.show();
        System.out.println("Child");
    }
    public static void main(String []args)
    {
        MethodOverRiding obj=new MethodOverRiding();
        obj.show();
    }

}