class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0],flag=0,ind=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>max)
            {
                max=nums[i]; ind=i;
            }
        for(int i=0;i<nums.length;i++)
            if (i!=ind && max<(nums[i]*2)) 
                return -1;
        return ind;
    }
}

