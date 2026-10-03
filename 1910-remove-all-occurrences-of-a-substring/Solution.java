/*
LeetCode: 1910. Remove All Occurrences of a Substring
Runtime: 13
Memory: 47228000
*/

class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}
