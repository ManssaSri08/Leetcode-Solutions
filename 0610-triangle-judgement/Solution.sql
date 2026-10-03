/*
LeetCode: 610. Triangle Judgement
Runtime: 306
Memory: N/A
*/

SELECT x,y,z,
IF(x+y>z AND x+z>y AND y+z>x, 'Yes', 'No') AS triangle 
FROM Triangle;
