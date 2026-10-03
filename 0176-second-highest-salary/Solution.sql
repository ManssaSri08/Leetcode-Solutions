/*
LeetCode: 176. Second Highest Salary
Runtime: 279
Memory: N/A
*/

SELECT MAX(salary) AS SecondHighestSalary FROM Employee where salary<
    (SELECT MAX(salary) FROM Employee);
