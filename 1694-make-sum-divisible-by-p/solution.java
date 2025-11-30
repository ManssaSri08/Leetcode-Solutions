class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for(int num:nums) sum+=num;
        int rem=(int)(sum%p);
        if(rem==0) return 0;
        long prefix=0;
        int ans=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefix=(prefix+nums[i])%p;
            int need=(int)((prefix-rem+p)%p);
            if(map.containsKey(need))
                ans=Math.min(ans,i-map.get(need));
            map.put((int)prefix,i);
        }
        return ans==nums.length?-1:ans;
    }
}
