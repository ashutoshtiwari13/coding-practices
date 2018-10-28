-- LeetCode Solution No.0175.
-- https://leetcode.com/problems/combine-two-tables
-- Yifan Gu

-- Write your MySQL query statement below
SELECT
    p.FirstName, p.LastName, a.City, a.State
FROM
    Person AS p
LEFT JOIN
    Address AS a
ON
    p.PersonID = a.PersonID
