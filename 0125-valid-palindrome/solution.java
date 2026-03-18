class Solution {
    public boolean isPalindrome(String s) {
        String result=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[] words=result.toCharArray();
        int left=0,right=result.length()-1;
        while(left<right){
            if(words[left]!=words[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}


