/*
LeetCode: 961. N-Repeated Element in Size 2N Array
Runtime: 17
Memory: 47728000
*/

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1)  return key;
        }
        return 0;
    }
}
