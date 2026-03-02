package Interview.Java11;

public class Java11StringDemo {
    public static void main(String[] args) {
        String text = "   Hello World!   \nHow are you?\nFine.  ";
        String empty = "   ";
        String single = "a";
        
        // isBlank() - checks if string is empty or contains only whitespace
        System.out.println("isBlank(): '" + empty + "' -> " + empty.isBlank());           // true
        System.out.println("isBlank(): '" + single + "' -> " + single.isBlank());         // false [web:57]
        
        // lines() - returns Stream of lines
        System.out.println("\nlines():");
        text.lines().forEach(line -> System.out.println("  > " + line));                  // Streams each line [web:57]
        
        // strip(), stripLeading(), stripTrailing() - remove whitespace (Unicode-aware)
        System.out.println("\nstrip(): '" + text.strip() + "'");                          // Hello World! How are you? Fine.
        System.out.println("stripLeading(): '" + text.stripLeading() + "'");              // Hello World!   \nHow are you?\nFine.  
        System.out.println("stripTrailing(): '" + text.stripTrailing() + "'");            //    Hello World! \nHow are you?\nFine. [web:57]
        
        // repeat() - repeats string n times
        System.out.println("\nrepeat(): '" + "Java".repeat(3) + "'");                     // JavaJavaJava [web:57]
    }
}

