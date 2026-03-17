class Solution {
    
    public int arraySign(int[] nums) {
        int prod=1;
        for(int n:nums){
            if(n>0) prod*=1;
            else if(n<0) prod*=-1;
            else return 0;
        }
        return prod;
    }
}
