class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] ch=result.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) 
        {
            if (ch[left] != ch[right]) 
            {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }
}


