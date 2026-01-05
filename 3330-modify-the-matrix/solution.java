class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int[] max=new int[C];
        for(int j=0;j<C;j++){
            int maxi=0;
            for(int i=0;i<R;i++){
                maxi=Math.max(maxi,matrix[i][j]);
            }
            max[j]=maxi;
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=max[j];
                }
            }
        }
        return matrix;
    }
}
