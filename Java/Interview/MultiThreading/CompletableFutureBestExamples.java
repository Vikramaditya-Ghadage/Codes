package Interview.MultiThreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureBestExamples {

    public static void main(String[] args) {

        CompletableFuture<Double> priceAfterDeliveryCharge=CompletableFuture.supplyAsync(() -> getBasePrice())
                                        .thenApply(price -> price+40);
        System.out.println("price + Delivery Charge:"+priceAfterDeliveryCharge.join());

        CompletableFuture<String> orderFlow=CompletableFuture.supplyAsync(()->createOrder())
                                            .thenCompose((orderId)-> 
                                            CompletableFuture.supplyAsync(()-> makePayment(orderId)));
        System.out.println("Order flow:"+orderFlow.join());

        
        CompletableFuture<String> userService =
                CompletableFuture.supplyAsync(() -> fetchUser());

        CompletableFuture<String> orderService =
                CompletableFuture.supplyAsync(() -> fetchOrder());

        CompletableFuture<String> response =
                userService.thenCombine(orderService,
                        (user, order) -> "Response: " + user + " | " + order);

        System.out.println(response.join());
    
    }

    // ---------- Mock service methods ----------
    static double getBasePrice() {
        return 100.0;
    }

    static String createOrder() {
        return "ORDER-101";
    }

    static String makePayment(String orderId) {
        return "Payment successful for " + orderId;
    }

    static String fetchUser() {
        return "User: Vikram";

    }

    static String fetchOrder() {
        return "Order: Laptop";
    }
}