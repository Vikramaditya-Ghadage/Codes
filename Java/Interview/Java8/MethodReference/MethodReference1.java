package Interview.Java8.MethodReference;

import java.util.*;

public class MethodReference1 {
    // Helper methods for method references
    public static boolean startsWithAllowedChar(String nm) {
        char first = nm.charAt(0);
        return first != 'A' && first != 'W' && first != 'S';
    }
    
    public static String toUpper(String nm) {
        return nm.toUpperCase();
    }
    
    public static boolean hasEvenLength(String nm) {
        return nm.length() % 2 == 0;
    }
    
    public static boolean lengthLessThan5(String nm) {
        return nm.length() < 5;
    }
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akash", "dipa", "Vikram", "Kunn", "Suraj", "Devv");

        // You can do this without static method also but in that
        // case you need to craete object 
        
        Optional<String> ans = names.stream()
            .filter(MethodReference1::startsWithAllowedChar)    // Method reference
            .map(MethodReference1::toUpper)                     // Method reference
            .filter(MethodReference1::hasEvenLength)            // Method reference
            .filter(MethodReference1::lengthLessThan5)          // Method reference
            .findFirst();

        if (ans.isPresent())
            System.out.println(ans.get());  // .get() to print value
        else
            System.out.println("Not Available");
    }
}

