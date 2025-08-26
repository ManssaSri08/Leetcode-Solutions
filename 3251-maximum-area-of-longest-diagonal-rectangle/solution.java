class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int len,wid,dia,maxdia=0,maxarea=0;
        for(int i=0;i<dimensions.length;i++){
                len=dimensions[i][0];
                wid=dimensions[i][1];
                dia=len*len+wid*wid;
                if(dia>maxdia||(dia==maxdia && len*wid>maxarea)){
                    maxdia=dia;
                    maxarea=len*wid;
                }
        }
        return maxarea;
    }
}
