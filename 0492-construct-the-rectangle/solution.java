class Solution {
    public int[] constructRectangle(int area) {
        for(int wid=(int)Math.sqrt(area);wid>=1;wid--){
                if(area%wid==0){
                    int len=area/wid;
                    return new int[] {len,wid};
                }
        }  
        return new int[] {};  
    }
}
