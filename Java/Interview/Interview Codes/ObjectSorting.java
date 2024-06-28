import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student implements Comparable<Student>
{
    private int roll_no;
    private String name;
    private double marks;
    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll_no;
    }
    public double getMarks()
    {
        return marks;
    }
    Student(int roll_no,String name,double marks)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
    public int compareTo(Student s)
    {
        if(s.marks>this.marks)
        return 1;
        else
        return -1;
    }
    public void display()
    {
        System.out.println(roll_no+" "+name+" "+marks);
    }
}
class Sortbyroll implements Comparator<Student> {
 
    public int compare(Student a, Student b)
    {
        return a.getRoll() - b.getRoll();
    }
}

class ObjectSorting
{
    public static void main(String []args)
    {
        Student s1=new Student(1,"Vikram",99.10);
        Student s2=new Student(4,"Anand",98.10);
        Student s3=new Student(3,"Sanjay",99.90);
        Student s4=new Student(2,"Nikhil",97.20);
        List<Student> student_list=new ArrayList<Student>();
        student_list.add(s1);
        student_list.add(s2);
        student_list.add(s3);
        student_list.add(s4);
        // Collections.sort(student_list);  // Default Sort using Comparable

        Collections.sort(student_list,new Sortbyroll());   // Sort using external Comparator

        
        // student_list = student_list.stream()
        // .sorted(Comparator.comparing(Student::getMarks).reversed())
        // .collect(Collectors.toList());

        for(Student st:student_list)
        st.display();

    }
}