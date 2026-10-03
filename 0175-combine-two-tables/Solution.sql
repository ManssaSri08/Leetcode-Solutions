/*
LeetCode: 175. Combine Two Tables
Runtime: 521
Memory: N/A
*/

SELECT  p.firstName, p.lastName, a.city, a.state FROM Person p LEFT JOIN Address a ON p.personId=a.personId;
