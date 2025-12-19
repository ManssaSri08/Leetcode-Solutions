class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String str:operations){
            if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                int a=stack.peek();
                stack.push(a*2);
            }
            else if(str.equals("+")){
                int n=stack.pop();
                int m=stack.peek();
                stack.push(n);
                stack.push(n+m);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int num:stack){
            sum+=num;
        }
        return sum;
    }
}
