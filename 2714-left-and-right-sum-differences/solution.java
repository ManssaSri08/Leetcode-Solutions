class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l=nums.length;
        int[] leftsum=new int[l];
        int[] rightsum=new int[l];
        int[] abs=new int[l];
        leftsum[0]=0; rightsum[l-1]=0;
        for(int i=1;i<l;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        for(int i=l-2;i>=0;i--){
            rightsum[i]=rightsum[i+1]+nums[i+1];
        }
        for(int i=0;i<l;i++){
            abs[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return abs;
    }
}
