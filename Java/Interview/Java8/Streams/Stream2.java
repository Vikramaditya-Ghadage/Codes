import java.util.*;
import java.util.stream.*;
class Employee
{
    public String name;
    public String dept;
    public int salary;
    Employee(){}
    Employee(String name,String dept,int salary)
    {
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }
    public String toString()
    {
        return name+" "+dept+" "+salary;
    }
    public String getDept()
    {
        return dept; 
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }   

    public void setDept(String dept)
    {
         this.dept=dept; 
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(int salary)
    {
       this.salary=salary;
    }   
    
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

    public static List<Employee> sortListByComparator(List<Employee> emp_list)
    {
        return emp_list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
    }

    public static Employee employeeWithHigestSalary(List<Employee> emp_list)
    {
        return emp_list.stream().max(Comparator.comparing(Employee::getSalary)).get();
    }

    // limit() and skip() will resturn list of stram that again we are again
    //converting to list of employee using collectiors
    public static List<Employee> employeeWithLowestSalary(List<Employee> emp_list)
    {
        return emp_list.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(1).collect(Collectors.toList());
    }


    public static List<Employee> sortList(List<Employee> emp_list)
    {
        return emp_list.stream().sorted((a1,a2) -> (a2.salary-a1.salary)).collect(Collectors.toList());
    }

    public static List<String> filterFirstName(List<Employee> emp_list,String dept)
    {
        return emp_list.stream().filter(nm -> nm.getDept().equals(dept))
        .sorted(Comparator.comparing(Employee::getSalary).reversed()).
        map(s1 -> s1.name.split(" ")[0]).collect(Collectors.toList());
    }

    public static List<String> getName(List<Employee> emp_list)
    {
        return emp_list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).
        map(it-> it.name.split(" ")[0]).collect(Collectors.toList());
    }
    public static void main(String args[])
    {
        Employee e1=new Employee("Vikram Ghadage","CSE",100);
        Employee e2=new Employee("Anand Gote","IT",97);
        Employee e3=new Employee("Sanjay Mali","Electonics",101);
        Employee e4=new Employee("Shivam pawar","CSE",98);
        List<Employee> emp_list=new ArrayList();
        emp_list.add(e1);
        emp_list.add(e2);
        emp_list.add(e3);
        emp_list.add(e4);

        emp_list.stream().map(s ->{
            s.setSalary(s.getSalary()+(s.getSalary()*10/100));   // increased salary by 10%
            return s;
        }).collect(Collectors.toList());
        emp_list.forEach(System.out::println);
        //emp_list=sortList(emp_list);

        // Sort List By using comparators
        // emp_list=sortListByComparator(emp_list);
        // emp_list.forEach(System.out::println);
       
      // Take only first name from highest salried person from CSE
    //    List<String> nm=filterFirstName(emp_list,"CSE");
    //    nm.forEach(System.out::println);


    //    List<String> nm=getName(emp_list);
    //    nm.forEach(System.out::println);
        
      // Map<String, List<Employee>> emp_map=groupByDept(emp_list);
   
         System.out.println(groupByDeptCnt(emp_list));
        // System.out.println(employeeWithHigestSalary(emp_list));
        // System.out.println(employeeWithLowestSalary(emp_list));

       // Employee with Highest Salary
    //    Optional<Employee> highest_salried_emp=emp_list.stream().findFirst();
    //    System.out.println(highest_salried_emp);

    }
}