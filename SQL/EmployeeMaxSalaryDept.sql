select name,department_name,max_salary_per_department from
(
    select e.name,d.department_name,e.salary as max_salary_per_department,
    DENSE_RANK() OVER(PARTITION BY d.dept_id ORDER BY e.salary DESC) as rk
    from employee e join department d 
    on e.dept_id=d.dept_id
) as temp_employee
where rk=1; --  top 1 from each department
