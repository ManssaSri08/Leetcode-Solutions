/*
LeetCode: 192. Word Frequency
Runtime: 67
Memory: 3904000
*/

tr -s ' ' '\n' < words.txt |
sort |
uniq -c | 
sort -r | 
awk '{print $2, $1}'  
