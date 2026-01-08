class Solution {
    int[] diff={1,0,-1,0,1};
    public int nearestExit(char[][] maze, int[] entrance) {
        int R=maze.length;
        int C=maze[0].length;
        Queue<int[]> q=new LinkedList<>();
        int erow=entrance[0],ecol=entrance[1];
        q.add(new int[]{erow,ecol,0});
        maze[erow][ecol]='+';
        while(!q.isEmpty()){
            int[] t=q.poll();
            int row=t[0],col=t[1],steps=t[2];
            if(steps!=0 && (row==0 || row==R-1 || col==0 || col==C-1)){
                return steps;
            }
            for(int i=0;i<4;i++){
                int ar=row+diff[i],ac=col+diff[i+1];
                if(ar>=0 && ar<R && ac>=0 && ac<C && maze[ar][ac]=='.'){
                    q.add(new int[]{ar,ac,steps+1});
                    maze[ar][ac]='+';
                }
            }
        }
        return -1;
    }
}
