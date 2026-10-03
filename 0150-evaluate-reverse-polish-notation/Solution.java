/*
LeetCode: 150. Evaluate Reverse Polish Notation
Runtime: 7
Memory: 45404000
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String ch:tokens){
            if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                switch(ch){
                    case "+":
                        stack.push(b+a); break;
                    case "-":
                        stack.push(b-a); break;
                    case "*":
                        stack.push(b*a); break;
                    case "/":
                        stack.push(b/a); break;
                }
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}
