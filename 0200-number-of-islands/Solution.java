/*
LeetCode: 200. Number of Islands
Runtime: 2
Memory: 52412000
*/

class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length, m=grid[0].length, iCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    iCount++;
                    change(grid,i,j);
                }
            }
        }
        return iCount;
    }
    public void change(char[][] mat,int i,int j){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length || mat[i][j]=='0'){
            return;
        }
        mat[i][j]='0';
        change(mat,i,j-1); //left
        change(mat,i,j+1); //right
        change(mat,i-1,j); //up
        change(mat,i+1,j); //down
    }
}
