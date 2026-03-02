import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

// if map not working -> VS Code	Ctrl+Shift+P → "Java: Clean Java Language Server Workspace"
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

public class EmployeeStreamsMain
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

    public Map.Entry<String, Long> getMaxCountDepartment(List<Employee> emp) {
    return emp.stream()
        .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()))
        .entrySet().stream()
        .max(Comparator.comparing(Map.Entry::getValue))
        .orElse(null);
    }


    public static Map<String, Double> groupByDeptSumSalaryGreater(List<Employee> employeeList,int expected_salary) {

        return 
        employeeList.stream().
        collect(Collectors.groupingBy(Employee::getDept,
        Collectors.summingDouble(Employee::getSalary)))
        .entrySet().stream()
        .filter(entry -> entry.getValue() > expected_salary)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
     }  



    // Maximum Salary per Department
     public static Map<String, Employee> groupByDeptMaxSalary(List<Employee> employeeList) {
        return employeeList.stream().
        collect( Collectors.groupingBy(Employee::getDept,
            Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)), 
                opt-> opt.get()
            ))
        );
    }

    // Lowest Salary employee per Department
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
        List<Employee> emp_list=new ArrayList<>();
        emp_list.add(e1);
        emp_list.add(e2);
        emp_list.add(e3);
        emp_list.add(e4);
        emp_list.add(e5);
        emp_list.add(e6);

        System.out.println("*************  Increase salary by 10% for all employees in CSE department **************************");
        emp_list.stream().map(s ->{
            s.setSalary(s.getSalary()+(s.getSalary()*10/100));   // increased salary by 10%
            return s;
        }).forEach(System.out::println);

        emp_list.stream()
                .filter(emp-> emp.getSalary()>90)
                .map(emp -> emp.getName()+" "+emp.getDept())
                .toList();

            
        // System.out.println("***********************  Sort List By using comparators ***********************************");
        // emp_list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        // //emp_list.stream().sorted((a1,a2) -> (a2.getSalary()-a1.getSalary())).forEach(System.out::println);

        // System.out.println("***********************  Employee with highest salary ***********************************");
        // System.out.println(emp_list.stream().max(Comparator.comparing(Employee::getSalary)).get());
        // System.out.println(emp_list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList()));

         System.out.println("***********************  Sum of salries  of Employee with salary grater than 90 ***********************************");
         System.out.println(emp_list.stream().filter(emp -> emp.getSalary() > 180).collect(Collectors.summingInt(Employee::getSalary))); 


        // System.out.println("***********************  Employee with Unique Salary ***********************************");

       
        //  System.out.println("***********************  Grouping By  ***********************************");
        // List<String> nm=filterFirstName(emp_list,"CSE");
        // nm.forEach(System.out::println);

        System.out.println(emp_list);
        System.out.println("***********************  Grouping By  ***********************************");
        // System.out.println(groupByDept(emp_list));
        // System.out.println(groupByDeptCnt(emp_list));
        // System.out.println(groupByDeptAvgSalary(emp_list));
        // System.out.println(groupByDeptMaxSalary(emp_list));
         System.out.println(groupByDeptSumSalaryGreater(emp_list,180));
    }
}


