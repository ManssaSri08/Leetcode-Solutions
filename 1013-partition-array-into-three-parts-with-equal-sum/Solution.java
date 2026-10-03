/*
LeetCode: 1013. Partition Array Into Three Parts With Equal Sum
Runtime: 2
Memory: 55488000
*/

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total=0;
        for(int n:arr){
            total+=n;
        }
        if(total%3!=0) return false;
        int target=total/3;
        int sum=0,count=0;
        for(int n:arr){
            sum+=n;
            if(sum==target){
                count++;
                sum=0;
            }
        }
        return count>=3;
    }
}
