/*
LeetCode: 1299. Replace Elements with Greatest Element on Right Side
Runtime: 2
Memory: 49240000
*/

class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxRight=-1;
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            arr[i]=maxRight;
            maxRight=Math.max(current,maxRight);
        }
        return arr;
    }
}
