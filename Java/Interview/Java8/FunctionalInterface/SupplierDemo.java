import java.util.function.*;
// Supplier -- No input only used to produce desirable output
class SupplierDemo
{
    public static void main(String args[])
    {
        Supplier<Double> random_no= () -> Math.random();
        System.out.println(random_no.get());
    }
}