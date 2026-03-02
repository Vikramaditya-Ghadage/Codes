package SDE_SHEET_JAVA.String1;
import java.util.*;

public class DecodeString {
    
    public static String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<StringBuilder> strstack=new Stack<>();

        StringBuilder curstr=new StringBuilder();

        int no=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                no=no*10+(c-'0');
                System.out.println(no);
            }
            else if(c=='[')
            {
                numStack.push(no);
                strstack.push(curstr);
                curstr=new StringBuilder();
                no=0;
            }
            else if(c==']')
            {
                int tno=numStack.pop();
                StringBuilder temp=new StringBuilder();
                for(int i=0;i<tno;i++)
                {
                    temp.append(curstr);
                }
                curstr=strstack.pop();
                curstr.append(temp);

            }
            else
            {
                curstr.append(c);
            }

        }

        return curstr.toString();
    }

    public static void main(String []args)
    {
        System.out.println(decodeString("(a*2)(b+5)"));
    }
}
