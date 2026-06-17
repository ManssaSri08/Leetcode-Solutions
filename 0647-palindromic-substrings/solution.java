class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))) count++;
            }
        }
        return count;
    }
    public boolean isPalindrome(String s){
        char[] arr=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            if(arr[left]!=arr[right]) return false;
            left++; right--;
        }
        return true;
    }
}
