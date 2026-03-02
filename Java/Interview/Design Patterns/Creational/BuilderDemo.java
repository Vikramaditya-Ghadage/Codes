package 
class User
{
    String name;
    int age;
    String mobile_no;
    String address;

    private User(UserBuilder userBuilder)
    {
        this.name=userBuilder.name;
        this.age=userBuilder.age;
        this.mobile_no=userBuilder.mobile_no;
        this.address=userBuilder.address;
    }

    public String toString()
    {
        return name+" "+age+" "+mobile_no+" "+address;
    }

    static class UserBuilder
    {
        String name;
        int age;
        String mobile_no;
        String address;

        UserBuilder(String name,int age)
        {
            this.name=name;
            this.age=age;
        }

        public UserBuilder mobile_no(String mobile_no)
        {
            this.mobile_no=mobile_no;
            return this;
        }

        public UserBuilder address(String address)
        {
            this.address=address;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        // Build user with all fields
        User user1=new User.UserBuilder("Vikram", 25)
        .mobile_no("9890165479")
        .address("Sangli")
        .build();

        System.err.println(user1);

        User user2=new User.UserBuilder("Vikram", 25)
        .address("Sangli")
        .build();

        System.err.println(user2);
    }
}