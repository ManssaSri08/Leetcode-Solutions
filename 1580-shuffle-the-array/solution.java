class Solution {
    public int[] shuffle(int[] nums, int n) {
        int N=nums.length;
        int[] result=new int[N];
        int j=0,u=0,v=n;
        for(int i=0;i<n;i++){
            result[j++]=nums[u++];
            result[j++]=nums[v++];
        }
        return result;
    }
}
