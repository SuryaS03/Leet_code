# Write your MySQL query statement below
select email from person GROUP BY email HAVING COUNT(*) > 1;