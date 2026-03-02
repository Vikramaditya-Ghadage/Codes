package SDE_SHEET_JAVA.Array3;
public class Pow
{
    //Time complexity is O(N)
    public static int calculatePowBruteFOrce(int no,int times)
    {
        int ans=1;
        for(int i=1;i<=times;i++)
        {
            ans=ans*no;
        }
            
        return ans;
    }

    //Time complexity is O(Log*N)
    public static int calculatePow(int no,int times)
    {
        int ans=1;
        int n=times;

        while(n>0)
        {
            if(n%2==0)
            {
                no=no*no;
                n=n/2;
            }
            else
            {
                ans*=no;
                n--;
            }
        }
    
        
        return ans;
    }

    public static void main(String[] args) 
    {
        // System.out.println("Power is:"+Math.pow(2,3));
        System.out.println("Power is:"+calculatePowBruteFOrce(2,3));

        System.out.println("Power is:"+calculatePow(2,3));
        
    }
}