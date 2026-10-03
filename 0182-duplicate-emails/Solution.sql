/*
LeetCode: 182. Duplicate Emails
Runtime: 425
Memory: N/A
*/

SELECT email FROM Person GROUP BY email HAVING COUNT(email)>1;
