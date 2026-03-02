import java.util.*;
import java.util.stream.*;
class Learning implements Comparable<Learning>
{
    private int id;
    private String name;
    private int salary;
    Learning(int id,String name,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getSalary()
    {
        return salary;
    }

    public String toString()
    {
        return id+" "+name+" "+salary;
    }

    public int compareTo(Learning obj)
    {
        return (obj.salary>salary)?1:-1;
    }

}

class SortID implements Comparator<Learning>
{
    public int compare(Learning a,Learning b)
    {
        return (a.getId()>b.getId())?1:-1;
    }
}
public class Test {

    public static void main(String[] args) {
        
        // List<Learning> list=new ArrayList<Learning>();

        // Learning l1=new Learning(1, "Vikram",100);
        // Learning l2=new Learning(2, "Sanjay",45);
        // Learning l3=new Learning(3, "Anand",60);
        // Learning l4=new Learning(4, "Nikhil",55);
        // list.add(l1);
        // list.add(l2);
        // list.add(l3);
        // list.add(l4);

        // list.forEach(System.out::println);

        // List<String> names=Arrays.asList("Sanjay","Vikramaditya","Anand","Sanjay","Madam");

        // System.out.println("Max String:"+names.stream().max(Comparator.comparing(String::valueOf)).get());

        // System.out.println("Max Length String:"+names.stream().max(Comparator.comparing(String::length)).get());
     
        // System.out.println(names.stream().filter(n -> n.equalsIgnoreCase( new StringBuilder(n).
        // reverse().toString())).collect(Collectors.toList()));

        
        
    }
}
