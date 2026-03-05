import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodRefernces {
    public static void main(String args[]) {
        List<String> no = Arrays.asList("101", "Vikramaditya", "null", "100", "99");

        int sum = no.stream()
            .map(StreamMethodRefernces::parseInteger)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .filter(i -> i % 2 == 1)  // Odd numbers
            .reduce(0, Integer::sum);

        System.out.println("Sum of all odd numbers is: " + sum);
    }

    public static Optional<Integer> parseInteger(String str) {
        try {
            return Optional.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
