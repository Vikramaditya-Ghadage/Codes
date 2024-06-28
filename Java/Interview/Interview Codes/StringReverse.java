class StringReverse
{
    public static void main(String []args)
    {
        String str="Vikram";
        StringBuilder bf=new StringBuilder(str);
        bf.reverse();
        str=bf.toString();
        System.out.println(str);
    }
}