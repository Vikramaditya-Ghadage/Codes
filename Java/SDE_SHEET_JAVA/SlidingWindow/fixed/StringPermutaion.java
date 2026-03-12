package fixed;

public class StringPermutaion {

    public static boolean checkPermutaion(String s1,String s2)
    {
        int []s1Cnt=new int[26];
        int []winCnt=new int[26];

        if(s1.length() > s2.length()) return false;
        
        for(int i=0;i<s1.length();i++)
        {
            s1Cnt[s1.charAt(i)-'a']++;
            winCnt[s2.charAt(i)-'a']++;
        }
        
        if(match(s1Cnt,winCnt)) return true; // Check First Window

        for(int i=s1.length();i<s2.length();i++)
        {

            winCnt[s2.charAt(i)-'a']++;   // Adding new window chracter frequency
            winCnt[s2.charAt(i-s1.length())-'a']--;  // removing last charcter frequency

            if(match(s1Cnt,winCnt)) return true;
        }

        return false;
    }
    public static boolean match(int []s1Cnt,int []winCnt)
    {
        for(int i=0;i<26;i++)
        {
            if(s1Cnt[i]!=winCnt[i])
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        String s1="adc";
        String s2="dcda";
        System.out.println(checkPermutaion(s1,s2));
    }
}
