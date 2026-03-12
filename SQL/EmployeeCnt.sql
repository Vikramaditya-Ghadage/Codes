-- In single Table
SELECT dept_id, COUNT(*) AS emp_cnt
FROM employee
GROUP BY dept_id
HAVING COUNT(*) > 10;

-- Departments with employee count more than 10
select name,department_name,emp_cnt_per_department from
(
    select e.name,d.department_name,
    COUNT(*) OVER(PARTITION BY d.dept_id)as emp_cnt_per_department
    from employee e join department d 
    ON e.dept_id=d.dept_id
) as temp_employee
where emp_cnt_per_department>10;


-- Department With Highest Employee Count
select department_name,emp_cnt from
(
    select d.department_name,
    COUNT(*) OVER(PARTITION BY d.dept_id)as emp_cnt
    from employee e join department d 
    ON e.dept_id=d.dept_id
) as temp_employee
order by emp_cnt desc limit 1;

-- Alternative 1
SELECT department_name, emp_cnt
FROM (
    SELECT department_name,
           emp_cnt,
           DENSE_RANK() OVER (ORDER BY emp_cnt DESC) AS rk
    FROM (
        SELECT d.department_name,
               COUNT(*) OVER (PARTITION BY d.dept_id) AS emp_cnt
        FROM employee e
        JOIN department d
            ON e.dept_id = d.dept_id
    ) t1
) t2
WHERE rk = 1;

-- Alternative 2
SELECT department_name, emp_cnt
FROM (
    SELECT 
        d.department_name,
        COUNT(*) AS emp_cnt,
        DENSE_RANK() OVER (ORDER BY COUNT(*) DESC) AS rk
    FROM employee e 
    JOIN department d 
        ON e.dept_id = d.dept_id
    GROUP BY d.dept_id
) AS temp_employee
WHERE rk = 1;



