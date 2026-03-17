class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,rich=0;
        for(int r=0;r<accounts.length;r++){
            for(int c=0;c<accounts[0].length;c++){
                sum+=accounts[r][c];
            }
            if(sum>rich) rich=sum;
            sum=0;
        }
        return rich;
    }
}
