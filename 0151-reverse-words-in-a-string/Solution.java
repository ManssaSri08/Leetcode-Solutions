/*
LeetCode: 151. Reverse Words in a String
Runtime: 8
Memory: 44368000
*/

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        int start=0,end=words.length-1;
        while(start<end){
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++; end--;
        }
        return String.join(" ",words);
    }
}
