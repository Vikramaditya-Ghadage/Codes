import java.util.*;
class OptionalClass
{
    public static void main(String args[])
    {
        String[] str=new String[5];
        Optional<String> n1=Optional.ofNullable(str[2]);
        if(n1.isPresent())
        {
             String ss=str[2].toLowerCase();
             System.out.println(str);

        }
        else
        {
            System.out.println("null");
        }
       
    }
}