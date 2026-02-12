class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount=new int[n+1];
        int[] trustedBy=new int[n+1];
        for(int i=0;i<trust.length;i++){
            int a=trust[i][0];
            int b=trust[i][1];
            trustCount[a]++;
            trustedBy[b]++;
        }
        for(int i=1;i<=n;i++){
            if(trustCount[i]==0 && trustedBy[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
