/*
LeetCode: 1832. Check if the Sentence Is Pangram
Runtime: N/A
Memory: 42928000
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        String str="abcdefghijklmnopqrstuvwxyz";
        for(char ch:str.toCharArray()){
            if(sentence.indexOf(ch)==-1) return false;
        }
        return true;
    }
}
