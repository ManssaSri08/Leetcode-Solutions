class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length,prevDiff=0,count=1;
        for(int i=1;i<n;i++){
            int diff=nums[i]-nums[i-1];
            if((diff<0 && prevDiff>=0) || (diff>0 && prevDiff<=0)){
                count++;
                prevDiff=diff;
            }
        }
        return count;
    }
}
