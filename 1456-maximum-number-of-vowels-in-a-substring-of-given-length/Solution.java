/*
LeetCode: 1456. Maximum Number of Vowels in a Substring of Given Length
Runtime: 12
Memory: 46308000
*/

class Solution {
    public int maxVowels(String s, int k) {
        int cnt=0,n=s.length();
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) cnt++;
        }
        int mx=cnt;
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))) cnt--;
            if(isVowel(s.charAt(i))) cnt++;
            mx=Math.max(mx,cnt);
        }
        return mx;
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
}
