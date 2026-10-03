/*
LeetCode: 1601. Maximum Number of Achievable Transfer Requests
Runtime: 115
Memory: 46824000
*/

class Solution {
    public int maximumRequests(int n, int[][] requests) {
        int m=requests.length;
        int max=0;
        for(int i=0;i<(1<<m);i++){
            boolean valid=true;
            int[] balance=new int[n];
            int count=0;
            for(int j=0;j<m;j++){
                if((i&(1<<j))!=0){
                    int from=requests[j][0];
                    int to=requests[j][1];
                    balance[from]++;
                    balance[to]--;
                    count++;
                }
            }
            for(int k=0;k<n;k++){
                if(balance[k]!=0){
                    valid=false;
                    break;
                }
            }
            if(valid)
                max=Math.max(max,count);
        }
        return max;
    }
}
