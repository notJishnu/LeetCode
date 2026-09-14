# Write your MySQL query statement below
select Department, Employee, Salary
from (
    select 
        D.name as Department,
        E.name as Employee,
        E.salary as Salary,
        dense_rank() over(partition by E.departmentId order by E.salary desc) as rnk
    from Employee E
    join Department D
    on E.departmentId = D.id
) ranked
where rnk <= 3

