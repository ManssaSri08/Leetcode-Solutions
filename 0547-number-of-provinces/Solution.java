/*
LeetCode: 547. Number of Provinces
Runtime: 1
Memory: 47448000
*/

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length, province=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                province++;
                dfs(i,isConnected,visited);
            }
        }
        return province;
    }
    public void dfs(int x,int[][] mat,boolean[] visited){
        visited[x]=true;
        for(int i=0;i<mat.length;i++){
            if(mat[x][i]==1){
                if(!visited[i]){
                    dfs(i,mat,visited);
                }
            }
        }
    }
}
