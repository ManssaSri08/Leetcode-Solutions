/*
LeetCode: 219. Contains Duplicate II
Runtime: 23
Memory: 90696000
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k)
                    return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
