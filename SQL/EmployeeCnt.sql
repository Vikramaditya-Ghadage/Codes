-- In single Table
SELECT dept_id, COUNT(*) AS emp_cnt
FROM employee
GROUP BY dept_id
HAVING COUNT(*) > 10;

-- 2 Tables
select name,department_name,emp_cnt_per_department from
(
    select e.name,d.department_name,
    COUNT(*) OVER(PARTITION BY d.dept_id)as emp_cnt_per_department
    from employee e join department d 
    ON e.dept_id=d.dept_id
) as temp_employee
where emp_cnt_per_department>10;