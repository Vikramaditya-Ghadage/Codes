class Overload
{
    public static void add(int a)
    {
        System.out.println(a);
    }
    public static void add(String a)
    {
        System.out.println("String one:"+a);
    }
    public static void add(float a)
    {
        System.out.println("float one:"+a);
    }
    public static void main(String []args)
    {
        add(null);

    }
}