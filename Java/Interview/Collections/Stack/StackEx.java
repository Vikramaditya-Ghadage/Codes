import java.util.*;
class StackEx
{
    public static void main(String []args)
    {
        String str="(({[{]}))";
        Stack<Character> st=new Stack<Character>();
        try{
            for(int i=0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);
                if(ch==')')
                {
                    if(st.peek()!='(')
                    throw new Exception("Not Valid");
                    st.pop();                    
                }
                if(ch==']')
                {
                    if(st.peek()!='[')
                    throw new Exception("Not Valid");
                    st.pop();                    
                }
                if(ch=='}')
                {
                    if(st.peek()!='{')
                    throw new Exception("Not Valid");
                    st.pop();                    
                }

            }

            if(st.empty())
            System.out.println("Valid");
            else
            throw new Exception("Not Valid");

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
}