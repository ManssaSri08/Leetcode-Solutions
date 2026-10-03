/*
LeetCode: 169. Majority Element
Runtime: 21
Memory: 52428000
*/

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,majority=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>max){
                max=map.get(n);
                majority=n;
            }
        }
        return majority;
    }
}
