class Solution {
    public int mostFrequent(int[] nums, int key) {
        int ans=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int freq=map.getOrDefault(nums[i+1],0)+1;
                map.put(nums[i+1],freq);
                if(freq>max){
                    ans=nums[i+1];
                    max=freq;
                }
            }
        }
        return ans;
    }
}
