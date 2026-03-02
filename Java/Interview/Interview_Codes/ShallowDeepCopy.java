package Interview.Interview_Codes;

class Address
{
    String street;
    String city;
    Address(String street,String city)
    {
        this.street=street;
        this.city=city;
    }

    public String toString()
    {
        return  street+" "+city;
    }

     public Address clone() {
        return new Address(this.street, this.city);
    }
}

class UserDetails
{
    int id;
    String name;
    Address address;

    UserDetails(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public UserDetails shallowCopy()
    {
        return new UserDetails(this.id, this.name, this.address);
    }

    public UserDetails deepCopy()
    {
        return new UserDetails(this.id, this.name, this.address.clone());
    }

    public String toString()
    {
        return id+" "+name+" "+address;
    }
}
public class ShallowDeepCopy {
    public static void main(String[] args) {
        
        UserDetails orignDetails=new UserDetails(1, "Vikram",new Address("Balaji nagar","Sangli"));

        UserDetails userDetails1=orignDetails.shallowCopy();


        UserDetails userDetails2=orignDetails.deepCopy();

        userDetails1.address.street="Laxmi Mandir";

        System.out.println(orignDetails);
        System.out.println(userDetails1);
        System.out.println(userDetails2);



    }

}
