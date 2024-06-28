class SumNo
{
    
    public static int calSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+calSum(n-1);

    }

    public static void main(String str[])
    {
        int n=5;
        System.out.println(calSum(n));

    }
}
