select max(marks) from students order by salary desc limit 0,1

select name,marks from
(
    select name,marks,DENSE_RANK() OVER(order by salary desc) as rk 
    from student
) as ranked_student
where rk=2;


SELECT student_name, department_name, marks
FROM (
    SELECT 
        s.name AS student_name,
        d.dept_name AS department_name,
        s.marks,
        DENSE_RANK() OVER (
            PARTITION BY d.dept_id 
            ORDER BY s.marks DESC
        ) AS rk
    FROM student s
    JOIN department d 
        ON s.dept_id = d.dept_id
) ranked_student
WHERE rk = 1;