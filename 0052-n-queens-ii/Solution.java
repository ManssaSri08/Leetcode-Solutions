/*
LeetCode: 52. N-Queens II
Runtime: 2
Memory: 41996000
*/

class Solution {
    public char[][] mat;
    public int count=0, res=0;
    public boolean check(int r,int c,int n){
        for(int i=r-1;i>=0;i--){
        if(mat[i][c]=='Q')
            return false;
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
        if(mat[i][j]=='Q')
            return false;
        }
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
        if(mat[i][j]=='Q')
            return false;
        }
        return true;
    }
    public void fun(int r,int n){
        for(int c=0;c<n;c++){
        if(check(r,c,n)){
            mat[r][c]='Q';
            count++;
            if(count==n){
                res++;
            }
            fun(r+1,n);
            mat[r][c]='.';
            count--;
        }
        }
    }
    public int totalNQueens(int n) {
        mat=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]='.';
            }
        }
        fun(0,n);
        return res;
    }
}
