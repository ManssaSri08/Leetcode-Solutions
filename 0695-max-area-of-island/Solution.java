/*
LeetCode: 695. Max Area of Island
Runtime: 1
Memory: 46124000
*/

class Solution {
    public int area=0, max=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length, m=grid[0].length, iCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j);
                    max=Math.max(max,area);
                    area=0;
                }
            }
        }
        return max;
    }
    public void dfs(int[][] mat,int i,int j){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length || mat[i][j]!=1){
            return;
        }
        area+=mat[i][j];
        mat[i][j]=0;
        dfs(mat,i,j-1); //left
        dfs(mat,i,j+1); //right
        dfs(mat,i-1,j); //up
        dfs(mat,i+1,j); //down
    }
}
