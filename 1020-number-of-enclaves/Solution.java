/*
LeetCode: 1020. Number of Enclaves
Runtime: 9
Memory: 61908000
*/

class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length, m=grid[0].length, tot=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int count=dfs(grid,i,j);
                    if(count>0)
                        tot+=count;
                }
            }
        }
        return tot;
    }
    public int dfs(int[][] mat,int i,int j){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length){
            return -1;
        }
        if(mat[i][j]==0){ //represent water and also changed land to water
            return 0;
        }
        mat[i][j]=0;
        int left=dfs(mat,i,j-1);
        int right=dfs(mat,i,j+1);
        int up=dfs(mat,i-1,j);
        int down=dfs(mat,i+1,j);
        if(left==-1 || right==-1 || up==-1 || down==-1) return -1; //any one cell touches boundary
        return 1+left+right+up+down;
    }
}
