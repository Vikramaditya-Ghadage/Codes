import java.util.*;
public class StringExample {
    public static String stringCommpree(String str)
    {
        StringBuilder res=new StringBuilder();
        int cnt=1;
        for(int i=0;i<str.length();i++)
        {   
            char ch=str.charAt(i);
            if(i+1<str.length() && ch==str.charAt(i+1))
            {
                cnt++;
            }
            else
            {
                res.append(ch);
                res.append(cnt);
                cnt=1;
            }
        } 
            
        return res.toString();
    }
    public static void main(String[] args) {
        String str="aabbccccca";

        System.out.println(stringCommpree(str));

    }
}
