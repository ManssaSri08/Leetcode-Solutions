/*
LeetCode: 595. Big Countries
Runtime: 303
Memory: N/A
*/

Select name,population,area 
FROM World 
WHERE area>=3000000 
    OR population>=25000000;
