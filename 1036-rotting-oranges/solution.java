class Solution {
    int[] diff={1,0,-1,0,1};
    public int orangesRotting(int[][] grid) {
        int R=grid.length,C=grid[0].length;
        int oranges=0,time=0;
        Queue<int[]> q=new LinkedList<>();
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]!=0){
                    oranges++;
                    if(grid[r][c]==2){
                        q.add(new int[]{r,c,0});
                        grid[r][c]=0;
                    }
                }
            }
        }
        while(!q.isEmpty()){
            int[] t=q.poll();
            int row=t[0],col=t[1],mins=t[2];
            time=mins;
            oranges--;
            for(int i=0;i<4;i++){
                int ar=row+diff[i],ac=col+diff[i+1];
                if(ar>=0 && ar<R && ac>=0 && ac<C && grid[ar][ac]==1){
                    q.add(new int[]{ar,ac,mins+1});
                    grid[ar][ac]=0;
                }
            }
        }
        return oranges==0?time:-1;
    }
}
