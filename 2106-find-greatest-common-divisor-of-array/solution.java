class Solution {
    public int findGCD(int[] nums) {
        int smallest=nums[0],largest=nums[0],gcd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest)
            largest=nums[i];
            if(nums[i]<smallest)
            smallest=nums[i];
        }
        for(int i=1;i<=largest;i++){
            if(smallest%i==0 && largest%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
