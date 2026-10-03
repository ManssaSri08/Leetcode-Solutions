/*
LeetCode: 181. Employees Earning More Than Their Managers
Runtime: 389
Memory: N/A
*/

SELECT e.name AS Employee FROM Employee e JOIN Employee m ON e.managerID=m.id WHERE e.salary>m.salary;
