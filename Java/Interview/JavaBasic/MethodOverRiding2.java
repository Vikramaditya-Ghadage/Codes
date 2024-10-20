class Parent
{
    public void show()
    {
        System.out.println("Parent");
    }

    public void display()
    {
        System.out.println("Parent");
    }
}

class MethodOverRiding2 extends Parent
{
    public void show()
    {
        super.show();
        System.out.println("Child");
    }

    public void hello()
    {
        System.out.println("Child");
    }

    public static void main(String []args)
    {
        MethodOverRiding2 obj=new MethodOverRiding2();
        obj.display();

        // Parent obj=new MethodOverRiding2();
        // obj.hello();
    }

}