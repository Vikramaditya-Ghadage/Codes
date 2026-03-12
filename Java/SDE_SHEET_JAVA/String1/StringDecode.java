package SDE_SHEET_JAVA.String1;
import java.util.*;

public class StringDecode
{
    public static String decodeStr(String str)
    {
        String curr="";
        int no=0;
        Stack<Integer> cntStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(Character.isDigit(ch))
            {
              //  k=k*10+(ch-'0');
                  no=(int)ch-48;
            }

            else if(ch=='[')
            {
                
                cntStack.push(no);
                stringStack.push(curr);
                no=0;
                curr="";

            }
            else if(ch==']')
            {
                int times=cntStack.pop();
                StringBuilder temp=new StringBuilder(stringStack.pop());

                for(int j=0;j<times;j++)
                {
                    temp.append(curr);
                }
                curr=temp.toString();
            }
            else
            {
                curr+=ch;
            }

        }
        return curr;
    }
    public static void main(String[] args) {
        // String str="3[a2[c]]";
        String str="2[a]3[b]";
        System.out.println("Decoded String:"+decodeStr(str));
    }
}