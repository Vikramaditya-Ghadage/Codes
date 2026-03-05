
interface PaymentStatergy
{
    public void pay(int amount);
}

class UPIPaymentStatergy implements PaymentStatergy
{
    String upi_id;;
    UPIPaymentStatergy(String upi_id)
    {
        this.upi_id=upi_id;
    }
    public void pay(int amount)
    {
        System.out.println("Paid "+amount +" By UPI and No is:"+upi_id);
    }
}


class CreditCardPaymentStatergy implements PaymentStatergy
{
    String card_no;

    CreditCardPaymentStatergy(String card_no)
    {
        this.card_no=card_no;
    }
    public void pay(int amount)
    {
        System.out.println("Paid "+amount +" By Credit card no:"+card_no);
    }
}

class PaymentContext
{
    PaymentStatergy paymentStatergy;

    public void setPaymentStatergy(PaymentStatergy paymentStatergy)
    {
        this.paymentStatergy=paymentStatergy;
    }

    public void doPayment()
    {
        paymentStatergy.pay(100);
    }
}

class PaymentFactory  // Factory
{
    public static PaymentStatergy createProcessor(String choice)
    {
        switch(choice)
        {
            case "upi": return new UPIPaymentStatergy("user@paytm");
            case "creditcard": return new CreditCardPaymentStatergy("1234-5678");
            default: throw new IllegalArgumentException("Payment Option not Available:"+choice);
        }
    }
}


public class Statergy {
    public static void main(String[] args) {

        PaymentContext context=new PaymentContext();
        String choice="upi";

        context.setPaymentStatergy(PaymentFactory.createProcessor(choice)); // Statergy + Factory
        context.doPayment();

        choice="creditcard";
        context.setPaymentStatergy(PaymentFactory.createProcessor(choice));
        context.doPayment();

        choice="COD";
        context.setPaymentStatergy(PaymentFactory.createProcessor(choice));
        context.doPayment();   
        
    }
    
}
