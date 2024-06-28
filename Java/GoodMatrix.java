import java.util.*;
public class MyClass
{
    static int result=0;
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
 
        n=sc.nextInt();
        m=sc.nextInt();
        int nums[][]=new int[n][m];
                  
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    nums[i][j]=sc.nextInt();

                }

            }
            goodMat(nums,n,m);
    

    }
    public static void print(int nums[][],int n,int m)
    {
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                     System.out.print("\t"+nums[i][j]);

                }
                 System.out.println();

            }

    }
    public static void goodMat(int nums[][],int n,int m)
    {
        int gcr=0;
        ArrayList r=new ArrayList<>();
        ArrayList c=new ArrayList<>();           

            print(nums,n,m);
            for(int j=0;j<m;j++)
            {
                int c1[]=new int[n];
                int l=0;
                
                for(int i=0;i<n;i++)
                {
                    c1[l++]=nums[i][j];
                }
                if(findGCD(c1,c1.length)!=1)
                {
                    c.add(j);
                }
            }
            
            for(int i=0;i<n;i++)
            {
                int r1[]=new int[m];
                int k=0;
                for(int j=0;j<m;j++)
                {
                    r1[k++]=nums[i][j];
                }
                if(findGCD(r1,r1.length)!=1)
                {
                    if(!c.isEmpty())
                    {
                        int index=Integer.parseInt(c.get(0).toString());
                        nums[i][index]=1;
                        c.remove(0);
                    }
                    else
                    {
                        nums[i][0]=1;
                    }
                    result++;
                    print(nums,n,m);
                
                }
                
            }
            
            if(!c.isEmpty())
            {
                result=result+c.size();
            }
            

        System.out.println("Result:"+result);
    }
    
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    
      static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}