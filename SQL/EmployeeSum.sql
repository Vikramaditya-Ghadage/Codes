-- In single table find depatmenet wise salary sum
select department_name,avg_salary_per_department from
(
    select e.department_name,
    SUM(e.salary) OVER(PARTITION by e.department) as avg_salary_per_department
    from employee e
) as temp_employee;

-- 2 tables
SELECT department_name, sum_salary_per_department
FROM (
    SELECT 
        d.department_name,
        SUM(e.salary) OVER (PARTITION BY d.dept_id) AS sum_salary_per_department
    FROM employee e
    JOIN department d 
        ON e.dept_id = d.dept_id
) AS temp_employee;