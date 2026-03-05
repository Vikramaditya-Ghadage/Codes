import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Transaction {
        private String user;
        private double amount;
        private LocalDate date;
        
        public Transaction(String user, double amount, LocalDate date) {
            this.user = user;
            this.amount = amount;
            this.date = date;
        }
        
        // Getters
        public String getUser() { return user; }
        public double getAmount() { return amount; }
        public LocalDate getDate() { return date; }
        
        @Override
        public String toString() {
            return String.format("Transaction{user='%s', amount=%.2f, date=%s}", user, amount, date);
        }
}
public class TransactionalStream {
    public static void main(String[] args) {

        List<Transaction> transactional_list = Arrays.asList(
            new Transaction("Alice", 100.0, LocalDate.of(2025, 1, 15)),
            new Transaction("Alice", 80.0, LocalDate.of(2025, 2, 10)),
            new Transaction("Alice", 50.0, LocalDate.of(2025, 3, 5)),
            new Transaction("Alice", 120.0, LocalDate.of(2025, 4, 20)),
            new Transaction("Bob", 200.0, LocalDate.of(2025, 1, 1)),
            new Transaction("Bob", 90.0, LocalDate.of(2025, 2, 28)),
            new Transaction("Charlie", 150.0, LocalDate.of(2025, 1, 10)) , // Only 1 txn
            new Transaction("Charlie", 170.0, LocalDate.of(2025, 1, 10)) , 
            new Transaction("Vikram", 170.0, LocalDate.of(2026, 1, 10)) ,
            new Transaction("Vikram", 170.0, LocalDate.of(2025, 1, 10))  // Only 1 txn

        );
        
        int lastYear = 2025;
        
        // Single stream: filter 2025, group by user, get top3 + sum
        System.out.println(transactional_list.stream()
            .filter(t -> t.getDate().getYear() == lastYear)
            .collect(Collectors.groupingBy(
                Transaction::getUser,Collectors.summingDouble(Transaction::getAmount)))
            .entrySet().stream()
            .sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder())).
            limit(3)
            .collect(Collectors.toList())
        );

        
    }
}
