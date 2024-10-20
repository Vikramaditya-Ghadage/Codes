import java.util.*;
class DuplicateChar
{
    public static void main(String args[])
    {
        String str="abcddabceefddxcvbnnnvcxdgttgfd";
        String str2="";
        HashSet<Character> s1=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            s1.add(ch);
        }
    //    Iterator itr=s1.iterator();
    //    while(itr.hasNext())
    //    {
    //       str2=str2+itr.next();

    //    }
        for(char ch:s1)
        {
             str2=str2+ch;
        }
                
        System.out.println(str2);
    }
}