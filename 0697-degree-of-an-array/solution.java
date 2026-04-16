class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int degree=0,count=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(map.get(n)>degree){ 
                degree=map.get(n);
            }
        }
        int minLen=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            if(map.get(key)==degree){
                int start=-1,end=-1;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==key){
                        if(start==-1) start=i;
                        end=i;
                    }
                }
                minLen=Math.min(minLen,end-start+1);
            }
        }
        return minLen;
    }
}
