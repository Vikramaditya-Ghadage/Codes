package SDE_SHEET_JAVA.String1;

public class LargestPalindromicSubString {
     public static String findLarestPalSubString(String str)
    {
        int n=str.length();
        int maxLen=1;
        String ans="";
        for(int i=0;i<2*n-1;i++)
        {
            int lb=(i/2),ub=(i+1)/2;
            while(lb>=0 && ub<n && str.charAt(lb)==str.charAt(ub))
            {
                lb--;
                ub++;
            }
            int len=ub-lb-1;
            if(len>maxLen)
            {
                maxLen=len;
                ans=str.substring(lb+1, ub);

            }
        }
        return ans;
    }
    public static void main(String []args)
    {
        String str="cbhfbvhjdmadamnsdnvjdf";
        System.out.println(findLarestPalSubString(str));
    }
    
    
}
