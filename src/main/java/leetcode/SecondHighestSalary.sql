-- LeetCode Solution No.0176.
-- https://leetcode.com/problems/second-highest-salary
-- Yifan Gu

-- Write your MySQL query statement below
SELECT
    MAX(Salary) AS SecondHighestSalary
FROM
    Employee
WHERE
    Salary < (SELECT MAX(Salary) FROM Employee)
