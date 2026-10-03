/*
LeetCode: 130. Surrounded Regions
Runtime: 2
Memory: 47716000
*/

class Solution {
    public void solve(char[][] board) {
        int n=board.length, m=board[0].length;
        for(int i=0;i<n;i++){
            if(board[i][0]=='O')
                change(board,i,0);
            if(board[i][m-1]=='O')
                change(board,i,m-1);
        }
        for(int i=0;i<m;i++){
            if(board[0][i]=='O')
                change(board,0,i);
            if(board[n-1][i]=='O')
                change(board,n-1,i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='2'){
                    board[i][j]='O';
                }
                else if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    public void change(char[][] mat,int i,int j){
        if(i<0 || i==mat.length || j<0 || j==mat[0].length || mat[i][j]!='O'){
            return;
        }
        mat[i][j]='2';
        change(mat,i,j-1); //left
        change(mat,i,j+1); //right
        change(mat,i-1,j); //up
        change(mat,i+1,j); //down
    }
}
