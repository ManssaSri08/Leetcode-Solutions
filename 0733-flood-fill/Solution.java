/*
LeetCode: 733. Flood Fill
Runtime: N/A
Memory: 46840000
*/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length, m=image[0].length, original=image[sr][sc];
        if(original==color)
            return image;
        dfs(image,sr,sc,color,original);
        return image;
    }
    public void dfs(int[][] mat,int i,int j,int color,int original){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length)
            return;
        if(mat[i][j]==color || mat[i][j]!=original)
            return;
        mat[i][j]=color;
        dfs(mat,i,j-1,color,original);
        dfs(mat,i,j+1,color,original);
        dfs(mat,i-1,j,color,original);
        dfs(mat,i+1,j,color,original);
    }
}
