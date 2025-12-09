class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c++;
                if(c>1) return false;
                if(i>1 && nums[i]<nums[i-2] && i+1<nums.length && nums[i+1]<nums[i-1]) return false;
            }
        }
        return true;
    }
}
