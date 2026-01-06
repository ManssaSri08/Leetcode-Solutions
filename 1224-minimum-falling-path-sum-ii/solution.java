class Solution {
    public int minFallingPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int[][] res=new int[R][C];
        for(int j=0;j<C;j++){
            res[0][j]=grid[0][j];
        }
        for(int i=1;i<R;i++){
            int fmin=Integer.MAX_VALUE,smin=Integer.MAX_VALUE,minInd=Integer.MAX_VALUE;
            for(int j=0;j<C;j++){
                if(res[i-1][j]<fmin){
                    smin=fmin;
                    fmin=res[i-1][j];
                    minInd=j;
                }
                else if(res[i-1][j]<smin){
                    smin=res[i-1][j];
                }
            }
            for(int j=0;j<C;j++){
                if(j!=minInd){
                    res[i][j]=grid[i][j]+fmin;
                }
                else{
                    res[i][j]=grid[i][j]+smin;
                }
            }
        }
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<C;j++){
            if(res[R-1][j]<mini) mini=res[R-1][j];
        }
        return mini;
    }
}
