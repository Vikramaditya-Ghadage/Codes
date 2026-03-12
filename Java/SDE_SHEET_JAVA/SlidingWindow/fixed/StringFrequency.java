package fixed;

public class StringFrequency {
    public static String performCount(String str)
    {
        StringBuilder ans=new StringBuilder();
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
                ans.append(ch);
                ans.append(cnt);
                cnt=1;
            }
        }

        return ans.toString();
    }

    public static int maxCount(String str)
    {
        int cnt=1;
        int maxLen=1;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(i+1<str.length() && ch=='1' && str.charAt(i+1)=='1')
            {
                cnt++;
            }
            else
            {
                maxLen=Math.max(maxLen,cnt);
                cnt=1;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str="aabbbccabc";
        System.out.println(performCount(str));

        String input="00110111001111";
        System.out.println(maxCount(input));
    }
}
