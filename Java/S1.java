import java.util.*;
class S1
{
    public static void main(String args[])
    {
        String str="getUserByEmailAddress";
        List<String> li=new ArrayList<String>();
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90)
            {
                li.add(temp);
                temp="";
                temp=temp+ch;
            }
            else if(i==str.length()-1)
            {
                temp=temp+ch;
                li.add(temp);
            }
            else
            {
                temp=temp+ch;
            }
        }

        for(String s:li)
        System.out.println(s);
    }
}