/*
LeetCode: 1839. Longest Substring Of All Vowels in Order
Runtime: 33
Memory: 50876000
*/

class Solution {
    public int longestBeautifulSubstring(String word) {
        int left=0,ans=0,count=1;
        for(int right=1;right<word.length();right++){
            if(word.charAt(right)<word.charAt(right-1)){
                count=1;
                left=right;
            }
            else if(word.charAt(right)>word.charAt(right-1)){
                count++;
            }
            if(count>=5)
                ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
