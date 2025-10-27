class Solution {
    public boolean isValid(String s) {
        char[] stack=new char[s.length()]; int top=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack[++top]=c; }
            else{
                if(top==-1) return false;
                char topChar = stack[top--];
                if ((c == ')' && topChar != '(') ||
                    (c == '}' && topChar != '{') ||
                    (c == ']' && topChar != '[')) {
                    return false; }   }   }
        return top==-1;
    }
}
