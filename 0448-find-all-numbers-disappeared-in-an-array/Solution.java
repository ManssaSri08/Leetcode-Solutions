/*
LeetCode: 448. Find All Numbers Disappeared in an Array
Runtime: 3
Memory: 66644000
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present=new boolean[nums.length+1];
        for(int x:nums) present[x]=true;
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!present[i])
                result.add(i);
        }
        return result;
    }
}
