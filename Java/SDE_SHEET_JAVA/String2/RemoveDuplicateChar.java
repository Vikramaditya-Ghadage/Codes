package SDE_SHEET_JAVA.String2;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

    public static void removeChar(String str)
    {
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray())
            set.add(ch);
        System.out.println(set);
    }
    public static void main(String[] args) {
        String str="abccbahhnsjtsh";
        removeChar(str);
    }
}
