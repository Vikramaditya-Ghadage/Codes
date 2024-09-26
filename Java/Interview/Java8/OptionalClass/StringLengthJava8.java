import java.util.Optional;

public class StringLengthJava8 {
    public static void main(String[] args) {
        // Example string
        String str = "Hello, World!";

        // Using Optional and Stream to find the length of a single string
        Optional<Integer> length = Optional.of(str)
            .map(String::length); // Map the string to its length

        // Print the length
        length.ifPresent(len -> System.out.println("Length of the string: " + len));
    }
}
