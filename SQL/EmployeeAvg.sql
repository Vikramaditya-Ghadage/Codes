-- Employees whos salary is greater than there department avg salary insigle table
SELECT name,salary,department_name from
(
    select name,salary,department_name,
    avg(salary) OVER(PARTITION by department_name) as avg_salary_per_department
    from employee
)as tmp_emp
where  salary > avg_salary_per_department;

-- 2 tables
SELECT name, dept_name, salary
FROM (
    SELECT 
        e.name,
        d.dept_name,
        e.salary,
        AVG(e.salary) OVER (PARTITION BY d.dept_id) AS avg_salary_per_department
    FROM employee e
    JOIN department d
        ON e.dept_id = d.dept_id
) AS tmp_emp
WHERE salary > avg_salary_per_department;


