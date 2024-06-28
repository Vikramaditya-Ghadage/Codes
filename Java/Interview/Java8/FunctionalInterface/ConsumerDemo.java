import java.util.function.Consumer;
//Cunsumer --> Accept One parameter as input but not produce any output mainly used to modify the data
class ConsumerDemo
{
    public static void main(String args[])
    {
        Consumer<Integer> display= no -> System.out.println("Cube is:"+(no*no*no));
        display.accept(10);
    }
}