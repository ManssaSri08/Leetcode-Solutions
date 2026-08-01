class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length,max=1;
        int[] lis=new int[n];
        Arrays.fill(lis,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && lis[i]<=lis[j]){
                    lis[i]=lis[j]+1;
                    max=Math.max(max,lis[i]);
                }
            }
        }
        return max;
    }
}
