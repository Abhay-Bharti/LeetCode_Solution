# Write your MySQL query statement below
SELECT class From Courses GROUP BY class having count(class) >= 5;