public class Star {
    public static void main(String[] args) {
        
        int n=5;
        int spaces = n;
    
    for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = spaces; j >= 1; j--) {
            System.out.print(" ");
        }
        
        // Print stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        
        System.out.println();
        spaces--;
    }
    }
}
