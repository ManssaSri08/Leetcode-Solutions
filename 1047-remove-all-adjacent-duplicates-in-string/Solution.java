/*
LeetCode: 1047. Remove All Adjacent Duplicates In String
Runtime: 23
Memory: 45260000
*/

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) st.pop();
            else st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }
}

