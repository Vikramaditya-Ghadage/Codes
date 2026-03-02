import java.util.*;

class Product {
    private String name;
    private boolean inStock;
    private List<Customer> subscribers = new ArrayList<>();
    
    public Product(String name) {
        this.name = name;
        this.inStock = false;
    }
    
    public void subscribe(Customer customer) {
        subscribers.add(customer);
        System.out.println(customer.name + " subscribed for " + name);
    }
    
    // Inventory updated → Notify ALL subscribers
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) {
            notifySubscribers();
        }
    }
    
    private void notifySubscribers() {
        for (Customer customer : subscribers) {
            customer.receiveNotification(name + " is BACK IN STOCK!");
        }
    }
}

// Observer: Customers waiting for product
class Customer {
    String name;
    
    Customer(String name) {
        this.name = name;
    }
    
    void receiveNotification(String message) {
        System.out.println("📧 " + name + " got: " + message);
    }
}

// Amazon-like Demo
public class EcommerceObserver {
    public static void main(String[] args) {
        Product iPhone = new Product("iPhone 16 Pro");
        
        // Real customers subscribe
        Customer rahul = new Customer("Rahul-BLR");
        Customer priya = new Customer("Priya-MUM");
        iPhone.subscribe(rahul);
        iPhone.subscribe(priya);
        
        // Supplier restocks → AMAZON notifies everyone instantly
        iPhone.setInStock(true);
    }
}
