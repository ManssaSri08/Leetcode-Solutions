/*
LeetCode: 217. Contains Duplicate
Runtime: 16
Memory: 93236000
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num)) return true;
            set.add(num);
        }
        return false;
    }
}
