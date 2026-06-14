class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length,posC=0,negC=0,p=0,q=0;
        int[] res=new int[n];
        for(int num:nums){
            if(num>0) posC++;
            else negC++;
        }
        int[] pos=new int[posC];
        int[] neg=new int[negC];
        for(int num:nums){
            if(num>0) pos[p++]=num;
            else neg[q++]=num;
        }
        p=0;
        q=0;
        for(int i=0;i<n;i+=2){
            res[i]=pos[p++];
            res[i+1]=neg[q++];
        }
        return res;
    }
}
