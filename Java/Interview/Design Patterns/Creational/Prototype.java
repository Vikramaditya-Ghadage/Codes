public class Prototype implements Cloneable{

    private int id;
    private String name;
    Prototype(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String toString()
    {
        return id+" "+name;
    }

    public Object clone () throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String []args)
    {
        Prototype pro1=new Prototype(1, "Vikram");

        try{
            Prototype pro2=pro1;
            Prototype pro3=(Prototype)pro1.clone();
            System.out.println(pro1);
            System.out.println(pro2);
            System.out.println(pro3);

        } catch(Exception e){}



    }
    
}
