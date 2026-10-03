/*
LeetCode: 994. Rotting Oranges
Runtime: 1
Memory: 43716000
*/

class Solution {
    public int max=0;
    public int orangesRotting(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(grid,i,j,2);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
                max=Math.max(max,grid[i][j]);
            }
        }
        if(max==0) return 0;
        return max-2;
    }
    public void dfs(int[][] mat,int i,int j,int mins){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length)
            return;
        if(mat[i][j]==0 || (mat[i][j]!=1 && mat[i][j]<mins))
            return;
        mat[i][j]=mins;
        dfs(mat,i,j-1,mins+1);
        dfs(mat,i,j+1,mins+1);
        dfs(mat,i-1,j,mins+1);
        dfs(mat,i+1,j,mins+1);
    }
}
