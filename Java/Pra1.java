import java.util.*;

interface Coffee
{
    public String getDescription();
    public int getCost();
}

class PlainCoffee implements Coffee
{
   public String getDescription()
   {
        return "Plain Cofee";
   }

   public int getCost()
   {
    return 10;
   }

}

abstract class CofeeDecorator implements Coffee
{
    Coffee decoratorCofee;

    CofeeDecorator(Coffee coffee)
    {
        decoratorCofee=coffee;
    }

    public String getDescription()
   {
        return decoratorCofee.getDescription();
   }

   public int getCost()
   {
    return decoratorCofee.getCost();
   }

}

class MilkDecorator extends CofeeDecorator
{

    MilkDecorator(Coffee coffee)
    {
        super(coffee);
    }

    public String getDescription()
   {
        return decoratorCofee.getDescription()+" Milk";
   }

   public int getCost()
   {
        return decoratorCofee.getCost()+5;
   }

}

class SugarDecorator extends CofeeDecorator
{

    SugarDecorator(Coffee coffee)
    {
        super(coffee);
    }

    public String getDescription()
   {
        return decoratorCofee.getDescription()+" Sugar";
   }

   public int getCost()
   {
        return decoratorCofee.getCost()+6;
   }

}

public class Pra1 {

    public static void main(String[] args) {

        Coffee coffee=new PlainCoffee();
        coffee.getDescription();
        coffee.getCost();

        Coffee milkCoffee=new MilkDecorator(coffee);
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getCost());

        Coffee sugarMilkCoffee=new SugarDecorator(milkCoffee);

        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarMilkCoffee.getCost());

    }


}
