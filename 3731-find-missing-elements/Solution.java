/*
LeetCode: 3731. Find Missing Elements
Runtime: 7
Memory: 47152000
*/

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0], max=nums[n-1], ind=0;
        List<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(ind<n && i==nums[ind])
                ind++;
            else
                list.add(i);
        }
        return list;
    }
}
