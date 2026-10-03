/*
LeetCode: 22. Generate Parentheses
Runtime: 2
Memory: 44772000
*/

class Solution {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String s=new String();
        rec(s,0,0,n);
        return list;
    }
    public void rec(String s,int oc,int cc,int n){
        if(s.length()==(2*n)) list.add(s);
        if(oc<n){
            rec(s+"(",oc+1,cc,n);
        }
        if(cc<oc){
            rec(s+")",oc,cc+1,n);
        }
    }
}
