class Solution {
    public int alternatingSubarray(int[] nums) {
        int n=nums.length,ans=-1;
        for(int i=0;i<n;i++){
            int expected=1;
            int j=i;
            while(j+1<n && nums[j+1]-nums[j]==expected){
                j++;
                expected*=-1;
            }
            if(j>i)
                ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}
