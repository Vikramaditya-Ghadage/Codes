import java.util.*;

interface OrderObserver
{
    public void update(String ord_id,String staus);
}

class CustomerApp implements OrderObserver
{
    public void update(String ord_id,String staus)
    {
        System.out.println("Customer: Order with order id:"+ord_id+" is now :"+staus);
    }
}

class RiderApp implements OrderObserver
{
    public void update(String ord_id,String staus)
    {
        System.out.println("Rider: Order with order id:"+ord_id+" is now :"+staus);
    }
}

class Order
{
    String order_id;
    String status;
    List<OrderObserver> orderObserverList=new ArrayList<>();

    Order(String order_id)
    {
        this.order_id=order_id;
        this.status="ORDER_PLACED";
    }
  
   public void addObserver(OrderObserver orderObserver)
   {
        orderObserverList.add(orderObserver);
        notifyObserver();
   }

   public void setStatus(String newStatus)
   {
        this.status=newStatus;
        notifyObserver();
   }
   public void notifyObserver()
   {
        System.out.println();
        for(OrderObserver obj:orderObserverList)
        {
            obj.update(order_id, status);
        }
   }
}



public class QuickCommerceObserver {
    public static void main(String[] args) {
        Order order=new Order("1234");

        order.addObserver(new CustomerApp());
        order.addObserver(new RiderApp());

        order.setStatus("COOKING_IN_PROGRESS");
        order.setStatus("PICKUP_DONE");
        order.setStatus("OUT_FOR_DELIVERY");
        order.setStatus("DELIVERED");
    }
}
