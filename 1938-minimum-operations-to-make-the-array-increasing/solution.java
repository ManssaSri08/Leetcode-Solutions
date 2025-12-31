class Solution {
    public int minOperations(int[] nums) {
        if(nums==null || nums.length<=1) return 0;
        int op=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int need=nums[i-1]+1;
                op+=need-nums[i];
                nums[i]=need;
            }
        }
        return op;
    }
}
