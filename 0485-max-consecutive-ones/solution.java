class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int num:nums){
            if(num==1) count++;
            if(num==0) count=0;
            max=Math.max(max,count);
        }
        return max;
    }
}
