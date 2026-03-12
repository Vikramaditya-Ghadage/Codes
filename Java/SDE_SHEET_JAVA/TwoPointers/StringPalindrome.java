package SDE_SHEET_JAVA.TwoPointers;

public class StringPalindrome {

    public static boolean checkpalindrome(String str)
    {
        int n=str.length();

        for(int i=0;i<n/2;i++)
        {
            //System.out.println(str.charAt(i)+" "+str.charAt(n-i-1));
            if(str.charAt(i)!=str.charAt(n-i-1))
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println("String palindrome:"+checkpalindrome(str.toLowerCase()));
    }
}
