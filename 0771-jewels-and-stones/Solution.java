/*
LeetCode: 771. Jewels and Stones
Runtime: 1
Memory: 43360000
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            set.add(ch);
        }
        for(char ch:stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
