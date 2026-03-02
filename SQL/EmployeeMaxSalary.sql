select name,salary from
(
    select e.name,e.salary,
    DENSE_RANK() OVER(ORDER BY e.salary DESC) as rk
    from employee e
) as temp_employee
where rk<=3; --  top 3 



select name,max(salary) from employee 
order by salary desc limit 1,1;   -- Second Highest Salary
