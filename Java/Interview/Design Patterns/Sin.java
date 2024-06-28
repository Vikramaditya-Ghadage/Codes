class Sin
{
    static Sin obj;
    private Sin()
    { 
        
    }
    public static Sin getObject()
    {
       if(obj==null)
       {
             obj= new Sin();
             return obj;
       }
      
       else
       return obj;  
    }
    public static void main(String args[])
    {
       Sin obj1=Sin.getObject();
       Sin obj2=Sin.getObject();

       System.out.println(obj1==obj2);
    }
}