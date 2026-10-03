/*
LeetCode: 4049. Count Values With Equally Spaced Occurrences II
Runtime: 105
Memory: 263852000
*/

class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=0;
        for(ArrayList<Integer> pos:map.values()){
            if(pos.size()>=3){
                int diff=pos.get(1)-pos.get(0);
                boolean special=true;
                for (int i=2;i<pos.size();i++){
                    if(pos.get(i)-pos.get(i-1)!=diff){
                        special=false;
                        break;
                    }
                }
                if(special){
                    ans++;
                }
            }
        }
        return ans;
    }
}
