class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double windowAvg=0,windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        double maxAvg=windowSum/k;
        for(int i=k;i<n;i++){
            windowSum=windowSum-nums[i-k]+nums[i];
            maxAvg=Math.max(maxAvg,windowSum/k);
        }
        return maxAvg;
    }
}
