/*
LeetCode: 1748. Sum of Unique Elements
Runtime: 1
Memory: 42988000
*/

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
}
