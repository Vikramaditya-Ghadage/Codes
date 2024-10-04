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

    @Override
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

class Stream2
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
     public static Map<String, Integer> groupByDeptMaxSalary(List<Employee> employeeList) {
        return employeeList.stream()
            .collect(Collectors.groupingBy(
                Employee::getDept,  // Group by department
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),  // Find employee with max salary in each department
                    emp -> emp.map(Employee::getSalary).orElse(0)  // Extract salary, or return 0 if not found
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

        System.out.println("*************  Increase salary by 10% for all employees in CSE department **************************");
        emp_list.stream().map(s ->{
            s.setSalary(s.getSalary()+(s.getSalary()*10/100));   // increased salary by 10%
            return s;
        }).forEach(System.out::println);

            
        System.out.println("***********************  Sort List By using comparators ***********************************");
        emp_list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        //emp_list.stream().sorted((a1,a2) -> (a2.getSalary()-a1.getSalary())).forEach(System.out::println);

        System.out.println("***********************  Employee with highest salary ***********************************");
        System.out.println(emp_list.stream().max(Comparator.comparing(Employee::getSalary)).get());
        System.out.println(emp_list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList()));

        System.out.println("***********************  Employee with Sum of salries grater than 90 ***********************************");
        System.out.println(emp_list.stream().filter(emp -> emp.getSalary() > 100).mapToInt(Employee::getSalary).sum());   
       
        //  System.out.println("***********************  Grouping By  ***********************************");
        // List<String> nm=filterFirstName(emp_list,"CSE");
        // nm.forEach(System.out::println);

        System.out.println("***********************  Grouping By  ***********************************");
        System.out.println(groupByDept(emp_list));
        System.out.println(groupByDeptCnt(emp_list));
        System.out.println(groupByDeptAvgSalary(emp_list));
        System.out.println(groupByDeptMaxSalary(emp_list));
    }
}
