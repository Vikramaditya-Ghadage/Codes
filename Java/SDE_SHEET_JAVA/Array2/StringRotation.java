package SDE_SHEET_JAVA.Array2;

public class StringRotation {
    public static String rotateRight(String str,int k)
    {
        int n=str.length();
        return  str.substring(n-k,n) + str.substring(0,n-k) ;
    }
    public static String rotateLeft(String str,int k)
    {
        int n=str.length();
        return  str.substring(0+k,n) + str.substring(0,k) ;
    }
    public static void main(String[] args) {
        
        String str="abcdef";
        System.out.println("Right Rotation:"+rotateRight(str, 2));
        System.out.println("Left Rotation:"+rotateLeft(str, 2));

    }
    
}
