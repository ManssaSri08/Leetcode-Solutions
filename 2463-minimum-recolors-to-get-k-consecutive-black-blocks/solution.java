class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length(),whites=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') whites++;
        }
        int minOps=whites;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W') whites++;
            if(blocks.charAt(i-k)=='W') whites--;
            minOps=Math.min(minOps,whites);
        }
        return minOps;
    }
}
