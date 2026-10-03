/*
LeetCode: 1513. Number of Substrings With Only 1s
Runtime: 3
Memory: 46124000
*/

class Solution {
    public int numSub(String s) {
        long ans=0,count=0;
        int mod=1000000007;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count++;
                ans+=count;
            }
            else{
                count=0;
            }
        }
        return (int)(ans%mod);
    }
}
