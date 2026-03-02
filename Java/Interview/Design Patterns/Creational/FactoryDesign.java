
abstract class Plan
{
    protected double ratePerUnit;
    protected double unitConsumed;
    
    abstract void getRate();
    public void calculateBill()
    {
        System.out.println("Total Bill:"+ratePerUnit+"*"+unitConsumed+"="+ratePerUnit*unitConsumed);
    }
}

class DomesticPlan extends Plan
{
    void getRate()
    {
        ratePerUnit=10;
        unitConsumed=100;
    }
}

class IndustrialPlan extends Plan
{
    void getRate()
    {
        ratePerUnit=5;
        unitConsumed=100;
    }
}


public class FactoryDesign {

    public static void main(String args[])
    {
        Plan p=null;
        String pla="Industrial";
        if(pla.equals("Domestic"))
            p=new DomesticPlan();
        if(pla.equals("Industrial"))
            p=new IndustrialPlan();

        if(p!=null)
        {
            p.getRate();
            p.calculateBill();
        }
        else
            System.out.println("Invalid plan type");

    }
    
}
