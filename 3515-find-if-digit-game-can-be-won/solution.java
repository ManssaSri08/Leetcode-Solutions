class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0,sum2=0;
        for(int n:nums){
            if(n<10) sum1+=n;
            else sum2+=n;
        }
        return (sum1>sum2) || (sum2>sum1);
    }
}
