/*
LeetCode: 2658. Maximum Number of Fish in a Grid
Runtime: 3
Memory: 45936000
*/

class Solution {
    public int max=0, sum=0;
    public int findMaxFish(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    dfs(grid,i,j);
                    sum=0;
                }
            }
        }
        return max;
    }
    public void dfs(int[][] mat,int i,int j){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length || mat[i][j]<1){
            return;
        }
        sum+=mat[i][j];
        max=Math.max(max,sum);
        mat[i][j]=0;
        dfs(mat,i,j+1); //R
        dfs(mat,i,j-1); //L
        dfs(mat,i+1,j); //D
        dfs(mat,i-1,j); //U
    }
}
