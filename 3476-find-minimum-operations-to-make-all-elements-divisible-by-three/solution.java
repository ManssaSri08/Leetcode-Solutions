class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        for(int num:nums){
            int r=num%3;
            if(r!=0){
                op+=1;
            }
        }
        return op;
    }
}
