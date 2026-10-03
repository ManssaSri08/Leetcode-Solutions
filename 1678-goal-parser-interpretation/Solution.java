/*
LeetCode: 1678. Goal Parser Interpretation
Runtime: 1
Memory: 42948000
*/

class Solution {
    public String interpret(String command) {
        command=command.replace("()","o");
        command=command.replace("(al)","al");
        return command;
    }
}
