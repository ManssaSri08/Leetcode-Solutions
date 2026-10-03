/*
LeetCode: 1905. Count Sub Islands
Runtime: 21
Memory: 120448000
*/

class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n=grid1.length, m=grid1[0].length, iCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j]==1){
                    if(dfs(grid1,grid2,i,j))
                        iCount++;
                }
            }
        }
        return iCount;
    }
    public boolean dfs(int[][] mat1,int[][] mat2,int i,int j){
        if(i<0 || i==mat1.length || j<0 || j==mat1[0].length)
            return true;
        if(mat2[i][j]==0)
            return true;
        boolean valid=mat1[i][j]==1;
        mat2[i][j]=0;
        boolean left=dfs(mat1,mat2,i,j-1);
        boolean right=dfs(mat1,mat2,i,j+1);
        boolean up=dfs(mat1,mat2,i-1,j);
        boolean down=dfs(mat1,mat2,i+1,j);
        return valid && left && right && up && down;
    }
}
