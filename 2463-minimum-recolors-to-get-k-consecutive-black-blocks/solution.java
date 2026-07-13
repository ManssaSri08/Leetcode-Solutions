class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0,n=blocks.length(),count=0;
        for(int right=0;right<k;right++){
            if(blocks.charAt(right)=='W') count++;
        }
        int min=count;
        for(int right=k;right<n;right++){
            if(blocks.charAt(left)=='W') count--;
            if(blocks.charAt(right)=='W') count++;
            left++;
            min=Math.min(min,count);
        }
        return min;
    }
}
