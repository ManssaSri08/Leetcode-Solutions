class Solution {
    int[] diff={1,0,-1,0,1};
    public void dfs(int R,int C,int r,int c,char[][] grid,boolean[][] visited){
        visited[r][c]=true;
        for(int i=0;i<4;i++){
            int ar=r+diff[i],ac=c+diff[i+1];
            if(ar>=0 && ar<R && ac>=0 && ac<C && !visited[ar][ac] && grid[ar][ac]=='1'){
                visited[ar][ac]=true;
                dfs(R,C,ar,ac,grid,visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        boolean[][] visited=new boolean[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                visited[r][c]=false;
            }
        }
        int iCount=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]=='1' && !visited[r][c]){
                    iCount++;
                    dfs(R,C,r,c,grid,visited);
                }
            }
        }
        return iCount;
    }
}
