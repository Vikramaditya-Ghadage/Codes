class T5
{
    public static void main(String []args)
    {
        String one = "abcd12jkdsebejcbecjcjcndndnhddkancbsjdndnd"; 
        String two = "pqrst";
        String ans="";
        
        if(one.length()>two.length())
        {
            int k=one.length()-1;
            for(int i=two.length()-1;i>=0;i--)
            {
                char ch1=one.charAt(k);
                char ch2=two.charAt(i);
                k--;
                ans=ans+ch1+ch2;

            }
            String temp=one.substring(0,k);
            StringBuffer bf=new StringBuffer(temp);
            bf.reverse();
            ans=ans+bf.toString();           

        }
        else
        {

            int k=two.length()-1;
            for(int i=one.length()-1;i>=0;i--)
            {
                char ch1=two.charAt(k);
                char ch2=one.charAt(i);
                k--;
                ans=ans+ch1+ch2;

            }

            while(k>=0)
            {
                char ch1=two.charAt(k);
                k--;
                ans=ans+ch1;
            }


        }


        System.out.println(ans);
    }
}

//5241udtcsbraqp