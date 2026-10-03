/*
LeetCode: 4048. Count Values With Equally Spaced Occurrences I
Runtime: 3
Memory: 46900000
*/

class Solution {
    public int countSpecialIntegers(int[] nums) {
        ArrayList<Integer>[] pos=new ArrayList[101];
        for(int i=0;i<=100;i++){
            pos[i]=new ArrayList<>();
        }
        for(int i=0;i<nums.length;i++){
            pos[nums[i]].add(i);
        }
        int ans=0;
        for(int i=1;i<=100;i++){
            if(pos[i].size()==3){
                if (pos[i].get(1)-pos[i].get(0)==
                    pos[i].get(2)-pos[i].get(1)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
