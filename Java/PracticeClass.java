import java.util.concurrent.CompletableFuture;

public class PracticeClass {
    public static int getNo()
    {
        return 10;
    }
    public static int square(int no)
    {
        return no*no;
    }
    public static void main(String[] args) {
        
        CompletableFuture<Integer> task1=CompletableFuture.supplyAsync(()-> getNo()).
                                    thenApply(no -> no*no*no);

        CompletableFuture<Integer> task2=CompletableFuture.supplyAsync(()-> getNo()).
                                    thenCompose(no -> CompletableFuture.supplyAsync(()->square(no)));
        
        System.out.println(task1.join());

        System.out.println(task2.join());

    }
}
