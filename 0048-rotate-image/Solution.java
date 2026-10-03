/*
LeetCode: 48. Rotate Image
Runtime: N/A
Memory: 43716000
*/

class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length, m=mat[0].length;
        //transpose;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        //reverse each row
        for(int i=0;i<n;i++){
            int[] arr=mat[i];
            int st=0, ed=arr.length-1;
            while(st<ed){
                int t=arr[st];
                arr[st]=arr[ed];
                arr[ed]=t;
                st++; ed--;
            }
        }
    }
}
