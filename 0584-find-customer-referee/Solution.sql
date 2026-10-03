/*
LeetCode: 584. Find Customer Referee
Runtime: 711
Memory: N/A
*/

SELECT name 
FROM Customer 
WHERE referee_id!=2
OR referee_id IS null;
