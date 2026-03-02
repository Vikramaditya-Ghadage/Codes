
interface NotificationStatergy
{
    public void send(String msg);
}

class SMSNotificationStatergy implements NotificationStatergy
{
    String phone_no;

    SMSNotificationStatergy(String phone_no)
    {
        this.phone_no=phone_no;
    }

    public void send(String msg)
    {
        System.out.println("Send "+msg +" to phone no:"+phone_no);
    }
}

class EMailNotificationStatergy implements NotificationStatergy
{
    String email;

    EMailNotificationStatergy(String email)
    {
        this.email=email;
    }

    public void send(String msg)
    {
        System.out.println("Send "+msg +" to Email:"+email);
    }

}

class NotificationContext
{
    NotificationStatergy notificationStatergy;

    public void setNotificationContext(NotificationStatergy notificationStatergy)
    {
        this.notificationStatergy=notificationStatergy;
    }

    public void sendNotificationd(String msg)
    {
        notificationStatergy.send(msg);
    }
}

class NotificationFactory
{
    public static NotificationStatergy createNotification(String type)
    {
        switch(type.toLowerCase())
        {
            case "sms": return new SMSNotificationStatergy("9890764532");
            case "email": return new EMailNotificationStatergy("vik@gmail.com");
            default: throw new IllegalArgumentException("Notification type not allowed:"+type);
        }
    }
}

public class StatergyPlusFactory{
    public static void main(String[] args) {
        
        NotificationContext notificationContext=new NotificationContext();
        String msg="How Are you ?";

        String type="sms";
        notificationContext.setNotificationContext(NotificationFactory.createNotification(type));
        notificationContext.sendNotificationd(msg);

        type="email";
        notificationContext.setNotificationContext(NotificationFactory.createNotification(type));
        notificationContext.sendNotificationd(msg);

        type="whatsapp";
        notificationContext.setNotificationContext(NotificationFactory.createNotification(type));
        notificationContext.sendNotificationd(msg);
    }
    
}
