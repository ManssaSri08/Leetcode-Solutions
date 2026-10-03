/*
LeetCode: 434. Number of Segments in a String
Runtime: 1
Memory: 42724000
*/

class Solution {
    public int countSegments(String s) {
        if(s==null || s.length()==0) return 0;
        s=s.trim();
        if(s.isEmpty()) return 0;
        String[] words=s.split("\\s+");
        return words.length;
    }
}
