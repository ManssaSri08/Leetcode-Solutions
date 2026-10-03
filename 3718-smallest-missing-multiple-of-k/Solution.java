/*
LeetCode: 3718. Smallest Missing Multiple of K
Runtime: 2
Memory: 45560000
*/

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int res=k;
        while(set.contains(res)){
            res+=k;
        }
        return res;
    }
}
