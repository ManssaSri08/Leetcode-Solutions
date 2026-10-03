/*
LeetCode: 2154. Keep Multiplying Found Values by Two
Runtime: 3
Memory: 46444000
*/

class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
            set.add(num);
        while(set.contains(original))
            original=original*2;
        return original;
    }
}
