class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<num.length();i++){
            char curr=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>curr){
                st.pop(); k--;
            }
            st.push(curr);
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}
