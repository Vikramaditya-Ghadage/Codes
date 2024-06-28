// import java.util.*;
// class CharOcc
// {
//     public static void main(String []args)
//     {
//         String str="abcabcbaaaacccabbba";
//         HashMap<Character,Integer> find=new HashMap<Character,Integer>();
//         for(int i=0;i<str.length();i++)
//         {
//             char ch=str.charAt(i); 
//             if(find.containsKey(ch))
//             {
//                 int cnt=find.get(ch);
//                 find.put(ch,++cnt);
//             }
//             else
//             {
//                 find.put(ch,1);
//             }
//         }
//         System.out.println(find);

//     }
// }
import java.util.*;
class CharOcc
{
    public static void main(String []args)
    {
        String str="aabbccddeeegfhh";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                int cnt=map.get(ch);
                map.put(ch,++cnt);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for(Map.Entry obj:map.entrySet())
        System.out.println(obj.getKey()+":"+obj.getValue());

    }
}