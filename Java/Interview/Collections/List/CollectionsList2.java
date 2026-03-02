import java.util.*;
import java.util.stream.*;
class Employee {
    private String name;
    private String dept;
    private int salary;

    Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + dept + " " + salary;
    }

    public String getDept() { return dept; }
    public String getName() { return name; }
    public int getSalary() { return salary; }

    public void setDept(String dept) { this.dept = dept; }
    public void setName(String name) { this.name = name; }
    public void setSalary(int salary) { this.salary = salary; }
}

public class CollectionsList2
{
     public static Map<String, List<Employee>> groupByDept(List<Employee> employeeList) {
        return employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getDept));
     }

     public static Map<String,Long> groupByDeptCnt(List<Employee> employeeList) {
        return employeeList.stream().
        collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
     }

     public static Map<String, Double> groupByDeptAvgSalary(List<Employee> employeeList) {
        return employeeList.stream()
            .collect(Collectors.groupingBy(
                Employee::getDept,  // Group by department
                Collectors.averagingInt(Employee::getSalary)  // Calculate the average salary per department
            ));
    }

    // Maximum Marks per Department
     public static Map<String, Employee> groupByDeptMaxSalary(List<Employee> employeeList) {
        return employeeList.stream().
        collect( Collectors.groupingBy(Employee::getDept,
            Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)), 
                opt-> opt.get()
            ))
        );
    }

    // Lowest Salary emploee per Department
     public static Map<String, Employee> groupByDeptMaxSalaryEMeployee(List<Employee> employeeList) {
        return employeeList.stream()
            .collect(Collectors.groupingBy(
                Employee::getDept,  // Group by department
                Collectors.collectingAndThen(
                    Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                    opt -> opt.get()
                    )
                
            ));
    }

    public static List<String> filterFirstName(List<Employee> emp_list,String dept)
    {
        return emp_list.stream().filter(nm -> nm.getDept().equals(dept))
        .sorted(Comparator.comparing(Employee::getSalary).reversed()).
        map(s1 -> s1.getName().split(" ")[0]).collect(Collectors.toList());
    }

    public static void main(String args[])
    {
        Employee e1=new Employee("Vikram Ghadage","CSE",100);
        Employee e2=new Employee("Anand Gote","IT",97);
        Employee e3=new Employee("Sanjay Mali","Electonics",81);
        Employee e4=new Employee("Shivam pawar","CSE",98);
        Employee e5=new Employee("Nikhil Tarate","IT",85);
        Employee e6=new Employee("Ramjan Shaikh","Electonics",90);
        List<Employee> emp_list=new ArrayList();
        emp_list.add(e1);
        emp_list.add(e2);
        emp_list.add(e3);
        emp_list.add(e4);
        emp_list.add(e5);
        emp_list.add(e6);

        

    }
}
